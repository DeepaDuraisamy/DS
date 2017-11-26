package com.example.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableEx {
	public static void main(String args[]){
		List<EmployeeDetails> list = new ArrayList<EmployeeDetails>();
		list.add(new EmployeeDetails("Pushpa",4,100));
		list.add(new EmployeeDetails("Deepa",1,10000));
		list.add(new EmployeeDetails("Vasanth",2,20000));
		list.add(new EmployeeDetails("Nivas",3,40000));
        Collections.sort(list);
       // System.out.println("List---"+list);
        for(EmployeeDetails employee:list){
        	System.out.println("employee id---"+employee.getId());
        	System.out.println("employee name---"+employee.getName());
        	System.out.println("employee salary--"+employee.getSalary());
        }
        Collections.sort(list,new NameComparator());
        System.out.println("================Name comparator====");

        for(EmployeeDetails employee:list){
        	System.out.println("employee id---"+employee.getId());
        	System.out.println("employee name---"+employee.getName());
        	System.out.println("employee salary--"+employee.getSalary());
        }
        
        System.out.println("================Salary  comparator====");
        Collections.sort(list,new SalaryComparator());
        for(EmployeeDetails employee:list){
        	System.out.println("employee id---"+employee.getId());
        	System.out.println("employee name---"+employee.getName());
        	System.out.println("employee salary--"+employee.getSalary());
        }
	}
}
class NameComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		EmployeeDetails e1=(EmployeeDetails)o1;
		EmployeeDetails e2=(EmployeeDetails)o2;
		return e1.getName().compareTo(e2.getName());
	}
}
class SalaryComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		EmployeeDetails e1=(EmployeeDetails)o1;
		EmployeeDetails e2=(EmployeeDetails)o2;
		return e1.getSalary() - (e2.getSalary());
	}
	
}