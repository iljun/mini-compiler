package com.iljun.compiler.domains.constant;

public enum Framework {

    SPRING(1);

    private int code;

    private Framework(int code) {
        this.code = code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode(int code) {
        return this.code;
    }
}
