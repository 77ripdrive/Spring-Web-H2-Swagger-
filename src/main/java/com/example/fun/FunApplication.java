package com.example.fun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FunApplication extends SpringBootServletInitializer {

	private final Logger logger = LoggerFactory.getLogger(FunApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(FunApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(final DataInitializer initializer) {
		return new CommandLineRunner() {
			@Override
			public void run(String... arg0) throws Exception {
				logger.info(
						"\n ******** Initializing Data ***********");
				initializer.initData();
			}
		};
	}
}
