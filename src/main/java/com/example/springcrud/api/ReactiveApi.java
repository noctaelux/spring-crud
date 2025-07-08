package com.example.springcrud.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequestMapping("/reactive")
public class ReactiveApi {

    @GetMapping(path = "/backpressure/{count}/{message}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> stream(@PathVariable("count") Long count, @PathVariable("message") String message) {

        return Flux
                .interval(Duration.ofNanos(count))
                .onBackpressureBuffer(1000)
                .onBackpressureDrop()
                .map(l -> String.format("Hello %s - sending message # %d.", message, l));
    }

}
