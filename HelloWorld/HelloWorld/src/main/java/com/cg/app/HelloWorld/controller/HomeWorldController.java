package com.cg.app.HelloWorld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.netflix.discovery.DiscoveryClient;

@RestController("/helloWorlds")
public class HomeWorldController {

	/*@Autowired
	private DiscoveryClient discovery;*/

	@GetMapping
	public String hello() {
		return "HELLO WORLD!!!!!!!!!";
	}

}
