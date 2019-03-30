package com.jithin.Ecommerce.models;

import java.util.List;

public class Response<T> {

    private T data;
    private Status status;
    private List<String> error;

    public Response(T data, Status status, List<String> error) {
        this.data = data;
        this.status = status;
        this.error = error;
    }
}


