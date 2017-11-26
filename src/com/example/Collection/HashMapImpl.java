package com.example.Collection;

import java.util.concurrent.ConcurrentHashMap;

import com.example.LL.LinkedList;

public class HashMapImpl {

	/*hashing principle
	key,value 
	
	key==null
	return 0;
	
	hash()
	16 -- > []*/
	
	// ReadaccessAvailable
	//writeaccessAvailable
	ConcurrentHashMap l;
	
	
	public int default_Capacity=16;
	Object object[]=new Object[16];
	LinkedList linkedList=new LinkedList();
    Entry entry;
	public void put(Object key,Object value){
			hash(key.hashCode());
			if(object[hash(key.hashCode())]==null){
			  linkedList=new LinkedList();
			    entry=new Entry(key,value);
				linkedList.addFirst(entry);
			}else{
				linkedList=(LinkedList)object[hash(key.hashCode())];
				if(!linkedList.search(key, value)){
					entry=new Entry(key,value);
					linkedList.addFirst(entry);
				}
			}
			object[hash(key.hashCode())]=linkedList;
	}
	public Object get(Object key){
		return key;
	}
	//Resize
	public int hash(int hashCode){
		return hashCode%default_Capacity;
	}
}
