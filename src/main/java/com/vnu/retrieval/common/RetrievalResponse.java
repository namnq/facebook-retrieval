package com.vnu.retrieval.common;

public class RetrievalResponse<T> {

    private Status status;

    private T data;

    public RetrievalResponse() {
        super();
    }

    public RetrievalResponse(Status status, T data) {
        this.status = status;
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public T getData() {
        return data;
    }
}
