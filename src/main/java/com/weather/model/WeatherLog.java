package com.weather.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains weather data.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "WeatherLog")
@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherLog implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty
	private long id;

	@Column(unique = true)
	@GeneratedValue(generator = "guid")
	@GenericGenerator(name = "guid", strategy = "guid")
	@JsonProperty
	private String responseId;

	@Column(nullable = false)
	@NotBlank
	@JsonProperty
	private String location;

	@Column(nullable = false)
	@NotBlank
	@JsonProperty
	private String actualWeather;

	@Column(nullable = false)
	@NotBlank
	@JsonProperty
	private String temperature;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@JsonProperty
	private Date timestamp;
	
	public WeatherLog() {
		this("", "", "");
	}
	
	public WeatherLog(String location, String actualWeather, String temperature) {
		this.location = location;
		this.actualWeather = actualWeather;
		this.temperature = temperature;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getResponseId() {
		return responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getActualWeather() {
		return actualWeather;
	}

	public void setActualWeather(String actualWeather) {
		this.actualWeather = actualWeather;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
