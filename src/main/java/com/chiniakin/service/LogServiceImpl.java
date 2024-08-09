package com.chiniakin.service;

import com.chiniakin.entity.Log;
import com.chiniakin.model.LogModel;
import com.chiniakin.repository.LogRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Сервис, обеспечивающий сохранение логов в базу и получение по названию сервиса.
 *
 * @author ChiniakinD
 */
@Service
@RequiredArgsConstructor
public class LogServiceImpl implements LogService {

    private final LogRepository logRepository;
    private final ModelMapper modelMapper;

    /**
     * Создает уникальный id и добавляет время перед сохранением лога.
     *
     * @param logModel модель лога для сохранения.
     */
    @Override
    public void save(LogModel logModel) {
        Log logEntity = modelMapper.map(logModel, Log.class);
        logEntity.setId(UUID.randomUUID())
                .setCreatedAt(OffsetDateTime.now());
        logRepository.save(logEntity);
    }

    @Override
    public List<LogModel> getServiceLogs(String serviceName) {
        List<Log> allByServiceName = logRepository.findAllByServiceName(serviceName);
        return allByServiceName.stream()
                .map(x -> modelMapper.map(x, LogModel.class))
                .toList();
    }

}
