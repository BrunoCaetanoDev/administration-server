package com.bruno.caetano.dev.administrationserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class AdministrationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdministrationServerApplication.class, args);
	}

}
