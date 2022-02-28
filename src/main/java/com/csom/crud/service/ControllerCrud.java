package com.csom.crud.service;

import java.util.Date;

import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ControllerCrud {
	
	@Autowired
	ServiceCrud service;

	private static final Logger log = LoggerFactory.getLogger(ControllerCrud.class);

	@RequestMapping("/lombok")
	public String index() {
		log.trace("A TRACE Message");
		log.debug("A DEBUG Message");
		log.info("An INFO Message");
		log.warn("A WARN Message");
		log.error("An ERROR Message");

		return "Howdy! Check out the Logs to see the output...";
	}

	@GetMapping(value = "/hello")
	public String helloWorld() {
		log.info("Inside Hello World Function");
		String response = "Hello World! " + new Date();
		log.info("Response => {}", response);
		return response;
	}

}
