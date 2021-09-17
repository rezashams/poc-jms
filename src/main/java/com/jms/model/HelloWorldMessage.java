package com.jms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
public class HelloWorldMessage implements Serializable {

    private static final long serialVersionUID = 2906642554793891381L;
    private UUID id;
    private String message;

    HelloWorldMessage(){

    }

}
