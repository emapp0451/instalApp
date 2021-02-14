package com.installation.instalApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages= "com.installation.instalApp.repository")
@SpringBootApplication
public class InstalAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstalAppApplication.class, args);
	}

}
