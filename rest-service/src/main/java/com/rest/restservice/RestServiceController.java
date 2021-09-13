package com.rest.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServiceController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public RestService restService(@RequestParam(value = "name", defaultValue = "World") String name)   {
        return new RestService(counter.incrementAndGet(), String.format(template, name));
    }
}
