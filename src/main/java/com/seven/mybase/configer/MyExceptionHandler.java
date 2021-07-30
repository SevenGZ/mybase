package com.seven.mybase.configer;

import com.seven.mybase.common.CommonResponse;
import com.seven.mybase.common.ResponseCodeEnum;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Log4j2
public class MyExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public CommonResponse exceptionHandler(Exception e) {
        log.error("系统出错", e);
        return CommonResponse.builder().code(ResponseCodeEnum.FAIL).msg(e.getMessage()).build();
    }
}
