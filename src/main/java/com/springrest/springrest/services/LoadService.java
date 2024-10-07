package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Load;

public interface LoadService {

	public List<Load> getloads();
	
	public Load getLoad(long l);

	public Load getLoad1(long long1);
}
