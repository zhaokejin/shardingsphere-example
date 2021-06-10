package cn.cicoding.read.write;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Sharding JDBC 垂直拆分（不同的表在不同的库中）
 */
@SpringBootApplication
public class ShardingJdbcReadWriteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingJdbcReadWriteApplication.class, args);
	}

}
