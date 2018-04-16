package com.vnu.retrieval.common;

public class Error {

    public String code;

    public String message;

    public Error() {
        super();
    }

    public Error(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
