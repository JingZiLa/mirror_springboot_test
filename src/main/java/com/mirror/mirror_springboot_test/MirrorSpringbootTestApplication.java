package com.mirror.mirror_springboot_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mirror.mirror_springboot_test.dao")//将项目中对应的mapper的路径加进来
@SpringBootApplication
public class MirrorSpringbootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MirrorSpringbootTestApplication.class, args);
	}

}
