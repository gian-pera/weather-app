package com.weather.orm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.weather.model.WeatherLogDTO;

/**
 * Default implementation of the {@link WeatherORM}.
 *
 */
@Repository
public class DefaultWeatherORM implements WeatherORM {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${open.weather.url}")
	private String url;
	
	@Value("${open.weather.key}")
	private String appKey;
	
	/**
	 * {@inheritDoc}
	 */
	public WeatherLogDTO requestWeather(String location) {
		
		UriComponents restUrl = UriComponentsBuilder.newInstance()
				.scheme("https")
				.host(url)
				.path("/data/2.5/weather")
				.queryParam("appid", appKey)
				.queryParam("q", location)
				.build();
		
		WeatherLogDTO result = null;
		try {
			ResponseEntity<WeatherLogDTO> response = restTemplate.getForEntity(
					restUrl.toString(), WeatherLogDTO.class);
			
			if (response.getStatusCode() == HttpStatus.OK) {
				result = response.getBody();
			}
		} catch (RestClientException e) {
			result = null;
		}
		
		return result;
	}
}
