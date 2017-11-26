package com.example.comparator;
public  class  EmployeeDetails implements Comparable{
	String name;
	int id;  
	int salary;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public EmployeeDetails(String name,int id,int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public int hashCode(){
		//System.out.println("hashCode"+this.id);
	
		return this.id;
	}
	
	/*equals(Object obj){}
	equals(Employee obj){}
	*/
	
	public boolean equals(Object obj){
		EmployeeDetails emp=(EmployeeDetails)obj;
	    if(this.id==emp.id){
	    	return true;
	    }else{
	    	return false;
	    }
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		EmployeeDetails emp=(EmployeeDetails)obj;
	//	return ((this.id==emp.id)?0:((this.id<emp.id)? -1:((this.id>emp.id)?1:0)));
		/*if(this.id==emp.id){
			return 0;
		}else if(this.id<emp.id){
			return -1;
			
		}else if(this.id>emp.id){
			return 1;
		}
		return 0;*/
		return this.id - emp.id;
	}

}