package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Load;
import com.springrest.springrest.services.LoadService;

@RestController
public class Mycontroller {

	
	@Autowired
	private LoadService loadservice;
	
	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}
	
	// get all the load
	@GetMapping("/loads")
	public List<Load> getLoads()
	{
		
		return this.loadservice.getloads();
	}
	
	@GetMapping("/loads/{loadId}")
	public Load getLoad(@PathVariable String loadId)
	{
		return this.loadservice.getLoad(Long.parseLong(loadId));
	}

	
	
}
