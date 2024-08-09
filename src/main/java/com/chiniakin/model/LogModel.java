package com.chiniakin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Модель лога.
 * @author  ChiniakinD
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LogModel implements Serializable {

    private String serviceName;
    private String methodName;
    private String methodArguments;
    private String returnMeaning;
    private String exception;

}
