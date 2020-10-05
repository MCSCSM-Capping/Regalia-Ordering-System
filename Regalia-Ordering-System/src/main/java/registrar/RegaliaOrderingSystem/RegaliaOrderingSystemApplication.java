package registrar.RegaliaOrderingSystem;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jasig.cas.client.boot.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import registrar.RegaliaOrderingSystem.Configuration.HibernateUtil;
import registrar.RegaliaOrderingSystem.Models.*;

@SpringBootApplication
@EnableCasClient
public class RegaliaOrderingSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(RegaliaOrderingSystemApplication.class, args);


	}

}
