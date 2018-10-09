package com.weather;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;


/**
 * Starting class of the weather application.
 */
@SpringBootApplication(scanBasePackages = {"com.weather"})
public class Application extends SpringBootServletInitializer {
	
	/**
	 * Constructs a {@link MappingJackson2HttpMessageConverter} to be used by the application.
	 * @return the constructed {@link MappingJackson2HttpMessageConverter}.
	 */
	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Arrays.asList(
        		MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
        
        return converter;
	}
	
	/**
	 * Constructs a {@link RestTemplate} to be used by the application.
	 * @return the constructed {@link RestTemplate}.
	 */
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		
		List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
		converters.add(mappingJackson2HttpMessageConverter());
		restTemplate.setMessageConverters(converters);

		return restTemplate;
	}
	
	/**
	 * Starting point of the applications.
	 * @param args the arguments to be passed to spring.
	 * @throws InstantiationException if an error was encountered while starting the application.
	 */
	public static void main(String[] args) throws InstantiationException {
		SpringApplication.run(Application.class, args);
	}
}
