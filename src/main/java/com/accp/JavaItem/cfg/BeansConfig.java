package com.accp.JavaItem.cfg;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan(basePackages = { "com.accp.JavaItem" })
public class BeansConfig {
	

}
