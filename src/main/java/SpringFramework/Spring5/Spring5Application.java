package SpringFramework.Spring5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan (basePackages = {"testPKG" , "SpringFramework.Spring5.model"})
public class Spring5Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring5Application.class, args);
	}

}
