package com.iljun.compiler.domains.constant;

public enum Language {

    JAVA(1),
    MYSQL(2);

    private int code;

    private Language(int code) {
        this.code = code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}
