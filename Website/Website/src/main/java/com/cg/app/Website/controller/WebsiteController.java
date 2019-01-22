package com.cg.app.Website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.netflix.discovery.DiscoveryClient;

@Controller
public class WebsiteController {
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/index")
	public ModelAndView getHelloWorld()
	{
		String message = restTemplate.exchange("http://helloWorld-service/helloWorlds", HttpMethod.GET, null,
				new ParameterizedTypeReference<String>()  {
				}).getBody();
		
		return new ModelAndView("index", "message", message);
		
		
	}

}
