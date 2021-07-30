package com.seven.mybase.controller;


import com.seven.mybase.common.CommonResponse;
import com.seven.mybase.common.ResponseCodeEnum;
import com.seven.mybase.service.BillConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 彩单配置信息表 前端控制器
 * </p>
 *
 * @author gaozhao
 * @since 2021-07-30
 */
@RestController
@RequestMapping("/mybase/billConfig")
public class BillConfigController {
    @Autowired
    BillConfigService billConfigService;

    @GetMapping("test")
    public CommonResponse test() {
        return CommonResponse.builder().code(ResponseCodeEnum.SUCCESS).data(billConfigService.list()).build();
    }

}
