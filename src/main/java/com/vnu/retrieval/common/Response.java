package com.vnu.retrieval.common;

import java.util.List;

public class Response<T> {

    private String status;

    private List<Error> errors;

    private List<? extends T> results;

    public Response() {
    }

    public <S extends T> Response(String status, List<Error> errors, List<S> results) {
        this.status = status;
        this.errors = errors;
        this.results = results;
    }

    public <S extends T> Response(String status, List<S> results) {
        this.status = status;
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public List<? extends T> getResults() {
        return results;
    }
}
