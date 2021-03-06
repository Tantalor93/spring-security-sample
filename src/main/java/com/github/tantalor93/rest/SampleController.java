package com.github.tantalor93.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);

	@GetMapping("/sample")
	public String getSample() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		UsernamePasswordAuthenticationToken basicAuth = (UsernamePasswordAuthenticationToken) authentication;
		LOGGER.info("'{}'", basicAuth);
		return "sample";
	}
}
