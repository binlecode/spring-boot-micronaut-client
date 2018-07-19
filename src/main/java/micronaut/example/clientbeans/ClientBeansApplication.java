package micronaut.example.clientbeans;

import io.micronaut.http.client.Client;
import io.micronaut.spring.beans.MicronautBeanProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientBeansApplication.class, args);
	}

	@Bean
	public MicronautBeanProcessor micronautBeanProcessor() {
		return new MicronautBeanProcessor(Client.class);
	}
}
