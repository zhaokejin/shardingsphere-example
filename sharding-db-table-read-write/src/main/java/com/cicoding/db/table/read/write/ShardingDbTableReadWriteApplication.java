package com.cicoding.db.table.read.write;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  Spring Boot版 Sharding JDBC 分库分表+读写分离案例
 */
@SpringBootApplication
public class ShardingDbTableReadWriteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingDbTableReadWriteApplication.class, args);
    }

}
