package com.qushoping.opapi.dto;

import lombok.Data;

/**
 * 返回结果
 *
 * @author yinguilong
 */
@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public static <T> Result<T> success(T t) {
        Result<T> result=new Result<>();
        result.code = 0;
        result.msg = "success";
        result.data = t;
        return  result;
    }
}
