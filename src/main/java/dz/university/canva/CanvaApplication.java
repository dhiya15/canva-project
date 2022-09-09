package dz.university.canva;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CanvaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanvaApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/canva/*"))
				.apis(RequestHandlerSelectors.basePackage("dz.university.canva"))
				.build()
				.apiInfo(apiDetails());
	}
	
	private ApiInfo apiDetails() {
		return new ApiInfo(
			"Canva crud api",
			"Simple api for canvas crud",
			"1.0",
			"Free to use",
			new springfox.documentation.service.Contact("Dz University", "www.dz-university.com", "contact@dz-university.com"),
			"Api licens",
			"www.dz-university.com",
			Collections.emptyList()
		);
	}

}
