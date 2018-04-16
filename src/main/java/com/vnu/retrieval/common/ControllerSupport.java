package com.vnu.retrieval.common;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;

import com.vnu.retrieval.common.StatusConstants.HttpConstants;

public interface ControllerSupport {

    default <T> T body(Request<T> request) {
        if (request == null || request.getBody() == null) {
            throw new RequestBodyNoSupplied();
        }
        return request.getBody();
    }

    default <T, E extends T> Response<T> response(HttpStatus status, List<E> results) {
        return new Response<>(status.name(), results);
    }

    default <T, E extends T> Response<T> response(HttpStatus status, E result) {
        return new Response<>(status.name(), Arrays.asList(result));
    }

    default <T> RetrievalResponse<T> response(HttpStatus status, String message, T data) {
        return new RetrievalResponse<>(new Status(status.value(), message), data);
    }

    default <T> RetrievalResponse<T> response(int code, String message, T data) {
        return new RetrievalResponse<>(new Status(code, message), data);
    }

    default <T> RetrievalResponse<T> success(T data) {
        return new RetrievalResponse<>(new Status(HttpConstants.SUCCESS), data);
    }

    default <T> RetrievalResponse<T> success() {
        return new RetrievalResponse<>(new Status(HttpConstants.SUCCESS), null);
    }

    default <T> RetrievalResponse<T> error(DomainException e, HttpServletResponse response) {
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        return new RetrievalResponse<>(new Status(e.getCode(), e.getMessage()), null);
    }

    default <T> RetrievalResponse<T> error(String msg) {
        return response(HttpStatus.BAD_REQUEST.value(), msg, null);
    }

    default <T> RetrievalResponse<T> error(DomainException e) {
        return new RetrievalResponse<>(new Status(e.getCode(), e.getMessage()), null);
    }

    default <T> RetrievalResponse<T> error(int code, String message, T data, HttpServletResponse response) {
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        return new RetrievalResponse<>(new Status(code, message), data);
    }

    default <T> RetrievalResponse<T> success(HttpConstants httpConstantsExpect, T data) {
        return new RetrievalResponse<>(new Status(httpConstantsExpect), data);
    }

    default <T> RetrievalResponse<T> badRequest(HttpConstants httpConstantsExpect, T data, HttpServletResponse response) {
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        return new RetrievalResponse<>(new Status(httpConstantsExpect), data);
    }

    default <T> RetrievalResponse<T> notFound(HttpConstants httpConstantsExpect, T data, HttpServletResponse response) {
        response.setStatus(HttpStatus.NOT_FOUND.value());
        return new RetrievalResponse<>(new Status(httpConstantsExpect), data);
    }

    default <T> RetrievalResponse<T> error(HttpConstants httpConstantsExpect, T data, HttpServletResponse response) {
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return new RetrievalResponse<>(new Status(httpConstantsExpect), data);
    }

}
