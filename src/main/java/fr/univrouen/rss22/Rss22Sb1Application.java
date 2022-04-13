package fr.univrouen.rss22;

import java.util.concurrent.TimeUnit;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class Rss22Sb1Application implements WebMvcConfigurer {
	private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
			"classpath:/META-INF/resources/", "classpath:/resources/",
			"classpath:/static/", "classpath:/public/" };
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		if (!registry.hasMappingForPattern("/webjars/**")) {
			registry.addResourceHandler("/webjars/**").addResourceLocations(
					"classpath:/META-INF/resources/webjars/");
		}
		if (!registry.hasMappingForPattern("/**")) {
			registry.addResourceHandler("/**").addResourceLocations(
					CLASSPATH_RESOURCE_LOCATIONS);
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(Rss22Sb1Application.class, args);
	}
	  @Bean
	  public GroupedOpenApi publicApi() {
	      return GroupedOpenApi.builder()
	              .group("springshop-public")
	              .pathsToMatch("/public/**")
	              .packagesToScan("fr.univrouen.rss22.controllers")
	              .build();
	  }
	  



}
