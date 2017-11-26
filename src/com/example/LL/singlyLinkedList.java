package com.example.LL;

public class singlyLinkedList {
	Node headNode;
	
	public boolean isEmpty(){
		if(headNode==null){
			return true;
		}
		return false;
	}
	
	public Node createNewNode(int data){
		Node newNode=new Node();
		newNode.setData(data);
		return newNode;
	}
	
	public void addFirst(int data){
		if(isEmpty()){
			Node newNode=createNewNode(data);
			headNode=newNode;
		}else{
			Node newNode=createNewNode(data);
            newNode.setNext(headNode);
            headNode=newNode;
		}
	}
	
	public void add(int data){
		addLast(data);
	}
	public void addLast(int data){
		if(isEmpty()){
			Node newNode=createNewNode(data);
			headNode=newNode;
		}else{
			Node node=headNode;
			while(node.getNext()!= null){
				node=node.getNext();
			}
			Node newNode=createNewNode(data);
			node.setNext(newNode);
		}
	}
	
   public void addAtIndex(int data,int position){
		    if(isEmpty()){
		    	System.out.println("List is empty");
		    }else{
			    	int index=1;
			    	Node node=headNode;
			    	if(position==1){
		    			Node newNode=createNewNode(data);
		    	   		newNode.setNext(headNode);
		    	   		headNode=newNode;
		    		}else{
		    			
					    	while(node!=null){
								if(index==(position-1)){
								  Node newNode=createNewNode(data);
								  newNode.setNext(node.getNext());
								  node.setNext(newNode);
								  break;
								}
								index++;
								node=node.getNext(); 	 
					    	}
		    		}
		  }
   }
   
   
   public void addAfter(int data,int newData){
	   if(isEmpty()){
	    	System.out.println("List is empty");
	    }else{
		   Node node=headNode;
		   while(node!=null){
			  if(node.getData()==data){
				  Node newNode=createNewNode(newData);
				  newNode.setNext(node.getNext());
				  node.setNext(newNode);
				  break;
			  }
			  node=node.getNext();
		   }
		   if(node.getData()!=data)
		   {
		     System.out.println("Data is not found in the list");
		   }
	    }
   }
   public void addBefore(int data,int newData){
	   
	   if(isEmpty()){
	    	System.out.println("List is empty");
	   }else{
		   boolean isFound=false;
		   Node node=headNode;
		   Node prevNode = null;
		   while(node!=null){
			   if(node.getData()==data){
				   Node newnode=new Node();
				   newnode.setData(newData);
				   newnode.setNext(node);
				   prevNode.setNext(newnode);
				   isFound=true;
				   break;
			   }
			   prevNode=node;
			   node=node.getNext();
		   }
		   if(node.getData()!=data){
		    	System.out.println("Data is not found in the linked list");
		   }
	   }
   }
   
   public Node find(int data){
	   if(!isEmpty()){
	    	System.out.println("List is empty");
	   }else{
		   Node node=headNode;
		   while(node!=null){
			   if(node.getData()==data){
				   return node;
			   }
			   node=node.getNext();
		   }
	   }
	   return null;
   }
   
   public void remove(int data){
	   
   }
   
   public void display(){
	   if(isEmpty()){
	    	System.out.println("List is empty");
	   }else{
		   Node node=headNode;
		   while(node!=null){
		      System.out.println("data - > "+node.getData());
			   node=node.getNext();
		   }
	   }
   }
   
   /*public void reverseLinkedList(){
	   if(isEmpty()){
	    	System.out.println("List is empty");
	   }else{
		   Node currentNode=headNode;
		   Node prevNode=null;
		   Node secondNext=null;
		   Node prevNode1=null;
              while(currentNode!=null){
            	  if(currentNode.getNext()!=null){
            		  secondNext=currentNode.getNext().getNext(); 
            		  prevNode1=currentNode.getNext();
            		  currentNode.getNext().setNext(currentNode);
            	  }else{
            		  headNode=currentNode;
            		  currentNode.setNext(prevNode);
            		  break;
            	  }
            	  if(currentNode==headNode){
            		  prevNode=currentNode.getNext();
            		  currentNode.setNext(null);
            	  }else{
            		
            		  currentNode.setNext(prevNode);
            		  prevNode=prevNode1;
            	  }
            	  currentNode=secondNext;
              	System.out.println("=======prevNode ===="+prevNode.getData());
              	System.out.println("=======prevNode ===="+prevNode.getNext().getData());
            	System.out.println("=======currentNode ===="+currentNode.getData());
              }
	   }
   }*/
   
   public void reverseLinkedList(){
	   if(isEmpty()){
	    	System.out.println("List is empty");
	   }else{
		   Node currentNode=headNode;
		   Node firstNext=null;
		   Node prevNode=null;
		   while(currentNode !=null){
			   firstNext=currentNode.getNext();
			   if(firstNext==null){
				   headNode= currentNode;
			   }
			   currentNode.setNext(prevNode);
			   prevNode=currentNode;
			   currentNode=firstNext;
			 }
		   
	   }
   }
   
   public void reverseLinkedListRecurion(){
	   if(isEmpty()){
	    	System.out.println("List is empty");
	   }else{
		  /* Node currentNode=headNode;
		   Node firstNext=null;
		   Node prevNode=null;
		   while(currentNode !=null){
			   firstNext=currentNode.getNext();
			   if(firstNext==null){
				   headNode= currentNode;
			   }
			   currentNode.setNext(prevNode);
			   prevNode=currentNode;
			   currentNode=firstNext;
			 }*/
		   Node prevNode=null;
		   reverseLinkedList(headNode,prevNode);
	   }
   }
   
   
	private void reverseLinkedList(Node currentNode,Node prevNode) {
	// TODO Auto-generated method stub
	
		Node firstNext=currentNode.getNext();
		currentNode.setNext(prevNode);
         if(firstNext!=null){
        	 reverseLinkedList(firstNext,currentNode) ;
         }else{
        	headNode=currentNode;
         }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singlyLinkedList linkedList=new singlyLinkedList();
		linkedList.add(20);
		linkedList.add(40);
		linkedList.add(60);
		linkedList.add(80);
		linkedList.add(90);
		linkedList.add(100);
		//linkedList.display();
    	System.out.println("=======ADD FIRST 10====");
		linkedList.addFirst(10);
		//linkedList.display();
    	System.out.println("=======ADD FIRST 70====");
    	linkedList.addFirst(70);
		//linkedList.display();

    	System.out.println("=======ADD FIRST  90====");
    	linkedList.addFirst(	90);
		//linkedList.display();
    	System.out.println("=======ADD AT index 4====");
    	linkedList.addAtIndex(120,4);
		//linkedList.display();
		System.out.println("=======ADD BEFORE 40====");
    	linkedList.addBefore(40,30);
		//linkedList.display();
		//System.out.println("=======ADD After 80====");
    	System.out.println("=======ADD after====");
    	linkedList.addAfter(80, 85);
		linkedList.display();
    	System.out.println("=======reverse  ====");
    	//linkedList.reverseLinkedList();
    	linkedList.reverseLinkedListRecurion();
    	linkedList.display();
	}
}
