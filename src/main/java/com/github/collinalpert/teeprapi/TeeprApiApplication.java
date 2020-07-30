package com.github.collinalpert.teeprapi;

import com.github.collinalpert.java2db.database.DBConnection;
import com.github.collinalpert.teeprapi.config.DatabaseConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		DatabaseConfiguration.class,
})
public class TeeprApiApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(TeeprApiApplication.class, args);
		var databaseConfig = context.getBean(DatabaseConfiguration.class);

		DBConnection.HOST = databaseConfig.getHost();
		DBConnection.DATABASE = databaseConfig.getDatabaseName();
		DBConnection.USERNAME = databaseConfig.getUsername();
		DBConnection.PASSWORD = databaseConfig.getPassword();
	}

}
