package com.uzay.yemeksitesi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.uzay.yemeksitesi.mapper") // Mapper arayüzlerinin bulunduğu paket
@SpringBootApplication
public class YemekSitesiApplication {

    public static void main(String[] args) {
        SpringApplication.run(YemekSitesiApplication.class, args);
    }

}
