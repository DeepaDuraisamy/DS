package com.example.Collection;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentHashMapImpl {

	public static void main(String args[]){
		ConcurrentHashMap chm=new ConcurrentHashMap();
		chm.put("1","Deepa");
		chm.put("2",null);
		Iterator<Map.Entry<String, String>> it1 = chm.entrySet().iterator();
		while (it1.hasNext()) {
		    Map.Entry<String, String> entry = it1.next();
		    System.out.println("stringbufferMap key==>"+entry.getKey());
		    System.out.println("stringbufferMap value"+entry.getValue());
		}
	}
}
