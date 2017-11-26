package com.example.Collection;

public final class  Employee {
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
/*public void setName(String name) {
	this.name = name;
}*/
public int getId() {
	return id;
}
/*public void setId(int id) {
	this.id = id;
}*/

public Employee(String name,int id){
	this.name=name;
	this.id=id;
}
public int hashCode(){
	//System.out.println("hashCode"+this.id);

	return this.id;
}

/*equals(Object obj){}
equals(Employee obj){}
*/

public boolean equals(Object obj){
	Employee emp=(Employee)obj;
    if(this.id==emp.id){
    	return true;
    }else{
    	return false;
    }
}
}