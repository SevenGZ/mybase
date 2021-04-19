package com.seven.mybase.controller.sys;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SysController {

    @GetMapping("sysHealthCheck")
    public String sysHealthCheck() {
        log.info("系统健康检查");
        return "OK";
    }

}
