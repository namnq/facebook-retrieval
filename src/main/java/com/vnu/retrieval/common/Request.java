package com.vnu.retrieval.common;


public class Request<T> {

    private T body;

    public T getBody() {
        return body;
    }

    public Request() {

    }

    public Request(T body) {
        this.body = body;
    }
}
