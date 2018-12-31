package com.spring.cloud.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private AppConfiguration appConfiguration;

	@RequestMapping(value = "/test/env", method = RequestMethod.GET)
	public String testDev() {
		return appConfiguration.getEnvString();
	}

}
