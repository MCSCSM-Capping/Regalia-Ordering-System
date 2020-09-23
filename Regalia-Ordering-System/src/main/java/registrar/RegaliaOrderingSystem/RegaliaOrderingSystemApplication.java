package registrar.RegaliaOrderingSystem;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import registrar.RegaliaOrderingSystem.Configuration.HibernateUtil;
import registrar.RegaliaOrderingSystem.Models.*;

@SpringBootApplication
public class RegaliaOrderingSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(RegaliaOrderingSystemApplication.class, args);


	}

}
