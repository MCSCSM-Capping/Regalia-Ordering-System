package registrar.RegaliaOrderingSystem;


import org.jasig.cas.client.boot.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@EnableCasClient
public class RegaliaOrderingSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(RegaliaOrderingSystemApplication.class, args);


	}

}
