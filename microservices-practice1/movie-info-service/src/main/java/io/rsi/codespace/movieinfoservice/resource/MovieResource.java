package io.rsi.codespace.movieinfoservice.resource;

import io.rsi.codespace.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/movies")
@RestController
public class MovieResource {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable String movieId) {
        return new Movie(movieId, "Test name");
    }
}
