package com.example.LL;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

import com.example.Collection.Entry;

public class LinkedList {
	private Node headNode=null;
	private Node lastNode=null;
	private int count=0;
	
	public void addFirst(int element){
		if(headNode==null){
			headNode = new Node();
			headNode.setNext(null);
			headNode.setData(element);
			headNode.setIndex(count++);
			lastNode=headNode;
		}else{
			Node node=headNode;
			Node headNode1=createNewNode(element);
			headNode1.setIndex(0);
			headNode=headNode1;
			node.setIndex(node.getIndex()+1);
			headNode.setNext(node);
		}
	}
	public void addLast(Object element){
       Node node = createNewNode(element);
       Node temp =lastNode;
       lastNode.setNext(node);
       lastNode=node;
	}
	private Node createNewNode(int element) {
		Node node=new Node();
		   node.setData(element);
		   node.setNext(null);
		   node.setIndex(count++);
		return node;
	}
    public void addMiddle(int element,int position){
    	boolean ismiddleFound=false;
    	for(Node node=headNode;node!=null;node=node.getNext()){
    		if(node.getIndex()==position){
    			Node temp=node.getNext();
    			Node node1 = createNewNode(element);
    			node.setNext(node1);
    			node1.setNext(temp);
    			ismiddleFound=true;
    			node=node.getNext();
    		}else if(ismiddleFound){
    			node.setIndex(node.getIndex()+1);
    		}
         }
    }
    
    public void traverse(){
    	boolean ismiddleFound=false;
    	for(Node node=headNode;node!=null;node=node.getNext()){
    	  System.out.println(node.getData());
         }
    }
    public Boolean search(Object key,Object value){
    	for(Node node=headNode;node!=null;node=node.getNext()){
      	     System.out.println(node.getData());
      	     Entry entry=(Entry)node.getData();
      	     if(entry.getKey().equals(key)){
      	    	entry.setValue(value);
      	    	return true;
      	     }
           }
    	return false;
    }
    
    	public  static void main(String args[]){
    		LinkedList a = new LinkedList();
    		/*a.addFirst("hello");
    		a.addFirst("hi");
    		a.addLast("how r u");
    		a.addMiddle("Deepa", 1);
    		a.addMiddle("Vasanth", 0);
    		a.addMiddle("laptop", 2);*/
    		a.traverse();
    	}
}
