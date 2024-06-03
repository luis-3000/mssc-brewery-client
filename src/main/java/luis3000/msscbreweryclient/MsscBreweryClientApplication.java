package luis3000.msscbreweryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@ComponentScan({"luis3000.msscbreweryclient.repositories.BeerRepository"})
public class MsscBreweryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscBreweryClientApplication.class, args);
	}

}
