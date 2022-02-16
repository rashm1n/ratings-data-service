package com.rashm1n.ratingsdataservice.resources;

import com.rashm1n.ratingsdataservice.model.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
    @GetMapping("/{movieId}") public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }
}
