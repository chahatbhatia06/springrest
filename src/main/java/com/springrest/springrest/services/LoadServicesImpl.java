package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Load;

@Service
public class LoadServicesImpl implements LoadService {
	
	List<Load> list;
	
	public LoadServicesImpl() {
	
		list = new ArrayList<>();
		list.add(new Load(151,"New Delhi","Mumbai",45.6));
		list.add(new Load(143,"Bangalore","New Delhi",4.6));

	}

	@Override
	public List<Load> getloads() {
		
		return list;
	}

	@Override
	public Load getLoad(long l) {
		
		Load l = null;
		for(Load load:list)
		{
			if(load.getId()==l)
			{
				l=load;
				break;
			}
		}
				
		return l;
	}

}
