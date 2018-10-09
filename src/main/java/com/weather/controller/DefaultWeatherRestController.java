package com.weather.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Default implementation of {@link WeatherRestController}.
 */
@RestController
@RequestMapping("/rest/1")
public class DefaultWeatherRestController implements WeatherRestController {

	/**
	 * {@inheritDoc}
	 */
	@RequestMapping(value = "/current", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getWeather(String weather) {
	
		DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy kk:mm");	
		
		Map<String, String> response = new HashMap<String, String>();
		response.put("currentTime", formatter.format(Calendar.getInstance().getTime()));
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		return new ResponseEntity<Map<String, String>>(response, headers, HttpStatus.OK);
	}

	/**
	 * {@inheritDoc}
	 */
	@RequestMapping(value = "/history", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getRecentRequests() {
		// TODO Auto-generated method stub
		return null;
	}

}
