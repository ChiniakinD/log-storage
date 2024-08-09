package com.chiniakin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Сущность лога.
 *
 * @author ChiniakinD
 */
@Entity
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "logs")
public class Log {

    @Id
    private UUID id;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "method_name")
    private String methodName;

    @Column(name = "method_arguments")
    private String methodArguments;

    @Column(name = "return_meaning")
    private String returnMeaning;

    @Column(name = "exception")
    private String exception;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;

}
