package api.mobile_0025;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"api.mobile_0025.controllers", "api.mobile_0025.services"})
@EntityScan(basePackages = "api.mobile_0025.entity")
@EnableJpaRepositories(basePackages = "api.mobile_0025.repository")
public class Mobile0025Application {

	public static void main(String[] args) {
		SpringApplication.run(Mobile0025Application.class, args);
	}

}
