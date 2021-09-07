package david.augusto.luan.sgeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SgeserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgeserviceApplication.class, args);
	}

}
