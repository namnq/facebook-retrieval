package com.vnu.retrieval.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DomainException extends RuntimeException {

    List<String> errors = new ArrayList<>();

    protected int code;

    public DomainException(String message, Throwable cause) {
        super(message, cause);
    }

    public boolean add(String error) {
        return errors.add(error);
    }

    public boolean addAll(Collection<? extends String> c) {
        return errors.addAll(c);
    }

    public List<String> getErrors() {
        return errors;
    }

    public int getCode() {
        return code;
    }

    public DomainException(String message, int code) {
        super(message, null);
        this.code = code;
    }


    public DomainException setCode(int code) {
        this.code = code;
        return this;
    }
}
