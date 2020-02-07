package cn.cicoding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Sharding-JDBC读写分离案例
 */
@SpringBootApplication
public class ShardingJdbcReadWriteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingJdbcReadWriteApplication.class, args);
	}

}
