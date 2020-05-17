package com.learn.mall.common.result;

import com.learn.mall.common.enums.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@AllArgsConstructor
public class CommonResult<T> {

    private long code;
    private String message;
    private T t;

    public static<T> CommonResult<T> success(T t){
        return new CommonResult(ResultCode.SUCCEED.getcode(),ResultCode.SUCCEED.getMessage(),t);
    }

    public static<T> CommonResult<T> failed(T t) {
        return new CommonResult(ResultCode.FAILD.getcode(),
                ResultCode.FAILD.getMessage(),
                t);
    }

    public static CommonResult failed() {
        return new CommonResult(ResultCode.FAILD.getcode(),
                ResultCode.FAILD.getMessage(),
                null);
    }


    public static<T> CommonResult<T> unauthorized(){
        return new CommonResult(ResultCode.AUTH_FAIL.getcode(), ResultCode.AUTH_FAIL.getMessage(), null);
    }

    public static<String> CommonResult<String> unauthorized(String message){
        return new CommonResult(ResultCode.AUTH_FAIL.getcode(), ResultCode.AUTH_FAIL.getMessage(), message);
    }

    public static<T> CommonResult<T> forbidden() {
        return new CommonResult<>(ResultCode.FORBIDDEN.getcode(), ResultCode.FORBIDDEN.getMessage(), null);
    }


    public static<String> CommonResult<String> forbidden(String message) {
        return new CommonResult(ResultCode.FORBIDDEN.getcode(), ResultCode.FORBIDDEN.getMessage(), message);
    }
}
