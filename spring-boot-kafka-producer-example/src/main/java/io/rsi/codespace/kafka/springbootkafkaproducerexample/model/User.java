package io.rsi.codespace.kafka.springbootkafkaproducerexample.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class User {
    private String name;
    private String dept;
    private String age;
}
