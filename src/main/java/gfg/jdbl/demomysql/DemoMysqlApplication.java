package gfg.jdbl.demomysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMysqlApplication.class, args);
		/*Person person= Person.builder()
				.firstName("Nitish")
				.lastName("Sajwan")
				.age(32)
				.build();
		System.out.println(person);*/
	}

}
