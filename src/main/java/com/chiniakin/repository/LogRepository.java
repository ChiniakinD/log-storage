package com.chiniakin.repository;

import com.chiniakin.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * Репозиторий для работы с логом.
 *
 * @author ChiniakinD
 */
@Repository
public interface LogRepository extends JpaRepository<Log, UUID> {

    /**
     * Получает лог по конкретному сервису.
     */
    List<Log> findAllByServiceName(String serviceName);

}
