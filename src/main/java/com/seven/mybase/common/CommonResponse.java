package com.seven.mybase.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommonResponse<T> {
    private ResponseCodeEnum code;
    private String msg;
    private T data;
}
