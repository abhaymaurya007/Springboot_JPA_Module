package com.nit.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;


@Repository
@Profile("dev")
public class FetchDatatImplFromOracle implements FetchData {
     
	private  final String Query="select BSAL from emp11";
	
	@Autowired
	private DataSource datasource;
	
	
	
	@Override
	public  List<Integer>  fetchData() {
		ArrayList<Integer> list=new ArrayList<Integer>();
		try {
			Connection conn=datasource.getConnection();
			PreparedStatement ps=conn.prepareStatement(Query);
		   ResultSet rs = ps.executeQuery();
		   
		   while(rs.next()) {
			   
			   list.add(rs.getInt(1));
			   
			   
		   }
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return list;
		
	}

}
