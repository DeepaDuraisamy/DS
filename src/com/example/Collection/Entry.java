package com.example.Collection;

public class Entry {

	Object key;
	public Object getKey() {
		return key;
	}
	public void setKey(Object key) {
		this.key = key;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	Object value;
	public Entry(Object key,Object value){
		this.key=key;
		this.value=value;
	}
	
}


