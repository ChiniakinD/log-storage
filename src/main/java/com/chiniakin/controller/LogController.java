package com.chiniakin.controller;

import com.chiniakin.model.LogModel;
import com.chiniakin.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Контроллер для работы с логами.
 *
 * @author ChiniakinD
 */
@RestController
@RequestMapping(value = "logs")
@RequiredArgsConstructor
public class LogController {

    private final LogService logService;

    /**
     * Получает список логов для конкректного сервиса.
     *
     * @param service название сервиса.
     * @return список логов.
     */
    @GetMapping("/{service}")
    public List<LogModel> getServiceLogs(@PathVariable("service") String service) {
        return logService.getServiceLogs(service);
    }

}
