package pl.haladyj.springsecurityjpa2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pl.haladyj.springsecurityjpa2.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityJpa2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpa2Application.class, args);
	}

}
