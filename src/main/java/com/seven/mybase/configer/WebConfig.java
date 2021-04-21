package com.seven.mybase.configer;

import com.seven.mybase.filter.ControllerFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean<ControllerFilter> controllerFilter() {
        FilterRegistrationBean<ControllerFilter> filterRegBean = new FilterRegistrationBean<>();
        filterRegBean.setFilter(new ControllerFilter());
        filterRegBean.addUrlPatterns("/*");
        filterRegBean.setOrder(Ordered.LOWEST_PRECEDENCE - 1);
        return filterRegBean;
    }
}
