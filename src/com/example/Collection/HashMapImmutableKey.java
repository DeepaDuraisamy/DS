package com.example.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class HashMapImmutableKey {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Employee emp=new Employee("Deepa",1);
			Employee emp1=new Employee("Deepa",1);
			/*if(emp.equals(emp1)){
				System.out.println("equals ");
	
			}*/
			Map map=new HashMap<Employee,Integer>();
			map.put(emp,10000);
			map.put(emp1,20000);
			//emp.setId(3);
			/*System.out.println("value"+map.get(emp));
			System.out.println("value"+map.get(emp1));*/
			Iterator<Map.Entry<Employee, Integer>> it = map.entrySet().iterator();
			while (it.hasNext()) {
			    Map.Entry<Employee, Integer> entry = it.next();
			    System.out.println("key"+entry.getKey().getName());
			    System.out.println("value"+entry.getValue());
			}
			System.out.println("=============================================");

	 		String s="Hello";
			String s1="hi";
			System.out.println("string s1 hashcode1===>"+s1.hashCode());

			StringBuffer stringbuffer=new StringBuffer();
			stringbuffer.append("hey");
			System.out.println("string buffer hashcode1===>"+stringbuffer.hashCode());

			StringBuffer stringbuffer1=new StringBuffer();
			stringbuffer1.append("Vasanth");
			Map stringbufferMap=new HashMap<String,String>();
			stringbufferMap.put(stringbuffer, "1000");
			stringbufferMap.put(stringbuffer1, "2000");
			stringbuffer.append("ewerwerwerwerrwerwerwerw");
			System.out.println("string buffer hashcode2===>"+stringbuffer.hashCode());

			System.out.println("value1===>"+stringbufferMap.get(stringbuffer));
			System.out.println("value2===>"+stringbufferMap.get(stringbuffer1));
			//System.out.println("value3===>"+stringbufferMap.get(stringbuffer));
			System.out.println("======== stringbufferMap iteration=====================================");

			Iterator<Map.Entry<Employee, Integer>> it1 = stringbufferMap.entrySet().iterator();
			while (it1.hasNext()) {
			    Map.Entry<Employee, Integer> entry = it1.next();
			    System.out.println("stringbufferMap key==>"+entry.getKey());
			    System.out.println("stringbufferMap value"+entry.getValue());
			}
			

			System.out.println("=============================================");

			Map map1=new HashMap<String,String>();
			map1.put(s,"100");
			map1.put(s1,"100");
			 s1="how r u ";
			System.out.println("value1"+map1.get(s));
			System.out.println("value2"+map1.get("hi"));
		}
}
