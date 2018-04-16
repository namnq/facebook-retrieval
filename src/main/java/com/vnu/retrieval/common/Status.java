package com.vnu.retrieval.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vnu.retrieval.common.StatusConstants.HttpConstants;

public class Status {

    public Integer code;

    public String message;

    public Status() {
    }

    public Status(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Status(HttpConstants httpConstantsExpect) {
        this.code = httpConstantsExpect.getCode();
        this.message = httpConstantsExpect.getDesc();
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @JsonIgnore
    public boolean isSuccess() {
        return ((Integer) HttpConstants.SUCCESS.getCode()).equals(code);
    }
}
