package io.rsi.codespace.movieinfoservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
public class Movie {
    private String movieId;
    private String name;
}
