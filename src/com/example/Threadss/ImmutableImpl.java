package com.example.Threadss;

import java.util.Collection;
import java.util.Collections;

import com.example.Collection.Employee;

public final class ImmutableImpl {
  
	private String name;
	private String description;
	private Employee employee;
	StringBuffer str;
	Collection c;
	Collections c1;
	
	public ImmutableImpl(String name,String description){
		this.name=name;
		this.description=description;
		//this.employee=employee.clone()
		Class.forName("com.jdbc.oracle.driver");
	}
	
	public String getDescription() {
		return description;
	}

	/*public void setDescription(String description) {
		this.description = description;
	}*/
	public String getName() {
		return name;
	}

	/*public void setName(String name) {
		this.name = name;
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
