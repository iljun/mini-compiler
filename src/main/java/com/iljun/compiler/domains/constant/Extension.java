package com.iljun.compiler.domains.constant;

public enum Extension {
    JAVA(1),
    SQL(2),
    JS(3),
    JSON(4),
    PROPERTIES(5),
    YAML(6),
    GRADLE(7),
    XML(8);

    private int code;

    private Extension(int code) {
        this.code = code;
    }
}
