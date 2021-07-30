package com.seven.mybase.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seven.mybase.entity.BillConfig;
import com.seven.mybase.mapper.BillConfigMapper;
import com.seven.mybase.service.BillConfigService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 彩单配置信息表 服务实现类
 * </p>
 *
 * @author gaozhao
 * @since 2021-07-30
 */
@Service
@DS("datasource_crm")
public class BillConfigServiceImpl extends ServiceImpl<BillConfigMapper, BillConfig> implements BillConfigService {

}
