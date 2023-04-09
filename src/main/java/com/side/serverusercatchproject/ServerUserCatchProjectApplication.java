package com.side.serverusercatchproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ServerUserCatchProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerUserCatchProjectApplication.class, args);
	}

}
