package com.example.springcrud.api;

import jakarta.websocket.server.PathParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/hello")
public class ExampleApi {

    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    public String hello() {
        return "Hello from Spring REST";
    }

    @GetMapping(path = "/{name}")
    public String helloName(@PathVariable("name") String name) {
        return "Hello from path param " + name;
    }

    @GetMapping(path = "/query")
    public String helloQuery(@PathParam("name") String name) {
        return Optional.ofNullable(name)
                .map(n -> "Hello " + n)
                .orElse("Agregue el parámetro name en la petición.");
    }
}
