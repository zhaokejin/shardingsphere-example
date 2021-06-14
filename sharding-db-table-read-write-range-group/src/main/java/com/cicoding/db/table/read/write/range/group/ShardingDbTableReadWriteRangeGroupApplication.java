package com.cicoding.db.table.read.write.range.group;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot版 Sharding JDBC 分库分表+读写分离案例(范围分表+取模=无限扩容)
 */

@SpringBootApplication
public class ShardingDbTableReadWriteRangeGroupApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingDbTableReadWriteRangeGroupApplication.class, args);
    }

}
