package com.chiniakin.service;

import com.chiniakin.model.LogModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Сервси для обработки сообщений Kafka.
 *
 * @author ChiniakinD
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaMessagingService {

    private final LogService logService;

    /**
     * Обрабатывает сообщение из Kafka, сохраняет лог и возвращает его обратно.
     */
    @Transactional
    @KafkaListener(topics = "audit-log-topic", groupId = "order-1", properties
            = {"spring.json.value.default.type=com.chiniakin.model.LogModel"})
    public LogModel createLog(LogModel logModel) {
        logService.save(logModel);
        log.info("Лог сервиса " + logModel.getServiceName() + " сохранен");
        return logModel;
    }

}
