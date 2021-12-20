package com.www.payment_demo.config;

/**
 * @author www
 * @date 2021年12月17日 13:50
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan("com.www.payment_demo.mapper")
@EnableTransactionManagement //启用事务管理
public class MybatisPlusConfig {
}
