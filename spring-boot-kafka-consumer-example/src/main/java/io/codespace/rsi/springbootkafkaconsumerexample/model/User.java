package io.codespace.rsi.springbootkafkaconsumerexample.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class User {
    private String name;
    private String dept;
    private String age;
}
