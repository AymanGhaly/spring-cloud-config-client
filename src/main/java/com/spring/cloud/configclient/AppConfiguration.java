package com.spring.cloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfiguration {

	@Value("${com.config.server.test.string}")
	private String envString;

	public String getEnvString() {
		return this.envString;
	}

}
