package com.chenfeng.xiaolyuh.conditional.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.chenfeng.xiaolyuh.conditional")
public class ConditionConfig {
	
//	@Bean
//	@Conditional(LinuxCondition.class)// 使用@Conditional注解，符合Linux条件就实例化LinuxListService
//	public ListService linuxListService() {
//		return new LinuxListService();
//	}
//
//	@Bean
//	@Conditional(WindowsCondition.class)// 使用@Conditional注解，符合Windows条件就实例化WindowsListService
//	public ListService windowsListService() {
//		return new WindowsListService();
//	}
}
