package com.ml.diamond.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Loki
 */
@Data
public class ResponseEntity<T> implements Serializable {

    Integer code;
    String msg = "";
    T data;
    String url = "";
    Integer wait = 3;

    public ResponseEntity<T> success(String msg) {
        this.code = OK;
        this.msg = msg;
        return this;
    }

    public ResponseEntity<T> success(String msg, T data) {
        this.code = OK;
        this.msg = msg;
        this.data = data;
        return this;
    }

    public ResponseEntity<T> failure(String msg) {
        this.code = NG;
        this.msg = msg;
        return this;
    }

    public ResponseEntity<T> url(String url) {
        this.url = url;
        return this;
    }

    public static final Integer OK = 1;
    public static final Integer NG = 0;

}
