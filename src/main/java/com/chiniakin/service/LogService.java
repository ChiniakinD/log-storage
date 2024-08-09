package com.chiniakin.service;

import com.chiniakin.model.LogModel;

import java.util.List;

/**
 * Интерфейс для работы с логами.
 */
public interface LogService {

    void save(LogModel logModel);

    List<LogModel> getServiceLogs(String serviceName);

}
