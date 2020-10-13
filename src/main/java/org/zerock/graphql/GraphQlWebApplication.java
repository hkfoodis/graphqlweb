package org.zerock.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(TomcatWebServerCustomizer.class)
public class GraphQlWebApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(GraphQlWebApplication.class, args);
	}


}
