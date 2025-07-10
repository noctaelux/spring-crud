package com.example.springcrud.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequestMapping("/reactive")
public class ReactiveApi {

    @GetMapping(path = "/backpressure/{interval}/{message}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> stream(@PathVariable("interval") Long interval, @PathVariable("message") String message) {

        return Flux
                .interval(Duration.ofNanos(interval))
                .onBackpressureBuffer(1000)
                .onBackpressureDrop()
                .map(l -> String.format("Hello %s - sending message # %d.", message, l));
    }

}
