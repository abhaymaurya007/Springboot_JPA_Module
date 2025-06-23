package com.nit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nit.DAO.FetchData;


@Service
@Profile({"dev","prod"})
public class FetchEmployeeData {
	
	@Autowired
	private FetchData fd;
	
	public void getData() {
		List<Integer> fetchData = fd.fetchData();
		
		fetchData.forEach(System.out::println);
		
	}

}
