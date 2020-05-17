package com.learn.mall.common.enums;

public enum ResultCode implements IResultCode {
    SUCCEED(0,"操作成功"),
    FAILD(-1,"操作失败"),
    AUTH_FAIL(2,"认证失败"),
    FORBIDDEN(3, "未登录或者权限不够");
    private long code;
    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getcode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
