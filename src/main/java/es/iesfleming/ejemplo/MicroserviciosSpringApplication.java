package es.iesfleming.ejemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MicroserviciosSpringApplication extends SpringBootServletInitializer  {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MicroserviciosSpringApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosSpringApplication.class, args);
	}

}
