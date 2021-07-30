package com.seven.mybase.controller;


import com.seven.mybase.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author gaozhao
 * @since 2021-04-22
 */
@RestController
@RequestMapping("/mybase/material")
public class MaterialController {
    @Autowired
    MaterialService materialService;

    @GetMapping("test")
    public Object test() {
        return materialService.list();
    }
}
