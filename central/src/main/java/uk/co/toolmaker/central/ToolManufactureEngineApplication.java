package uk.co.toolmaker.central;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToolManufactureEngineApplication {

	public static void main(String[] args) {

		try {
			SpringApplication.run(ToolManufactureEngineApplication.class, args);
		} catch(Throwable ex) {
			ex.printStackTrace();
		}
	}

}
