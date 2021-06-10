package cn.cicoding.db.sharding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Sharding JDBC 垂直拆分（不同的表在不同的库中）
 */
@SpringBootApplication
public class ShardingJdbcDbShardingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingJdbcDbShardingApplication.class, args);
	}

}
