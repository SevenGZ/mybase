package com.seven.mybase;

import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.seven.mybase.entity.Material;
import com.seven.mybase.mapper.MaterialMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class MyBatisPlusGeneratorTests {
    @Autowired
    MaterialMapper materialMapper;

    @Test
    void contextLoads() {
        List<Material> materials = materialMapper.selectList(new QueryWrapper<>());
        System.out.println(JSONUtil.toJsonStr(materials));
    }


}
