package com.iljun.compiler.domains.constant;

public enum GroupAuthority {

    MANAGER(1),
    READ(2),
    WRITE(3);

    private int code;

    private GroupAuthority(int code) {
        this.code = code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}
