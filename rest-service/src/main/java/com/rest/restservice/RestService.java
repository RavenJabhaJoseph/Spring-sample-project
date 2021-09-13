package com.rest.restservice;

public class RestService {
    private final long id;
    private final String content;

    public RestService(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
