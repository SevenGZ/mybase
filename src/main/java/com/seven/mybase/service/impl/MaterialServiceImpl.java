package com.seven.mybase.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seven.mybase.entity.Material;
import com.seven.mybase.mapper.MaterialMapper;
import com.seven.mybase.service.MaterialService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author gaozhao
 * @since 2021-04-22
 */
@DS("datasource_digital_receipt")
@Service
public class MaterialServiceImpl extends ServiceImpl<MaterialMapper, Material> implements MaterialService {

}
