package com.seven.mybase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybaseApplication {
    private static Logger logger = LoggerFactory.getLogger(MybaseApplication.class);

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        SpringApplication.run(MybaseApplication.class, args);
        long endTime = System.currentTimeMillis();
        logger.info("项目启动,耗时:" + (endTime - startTime));
    }

}
