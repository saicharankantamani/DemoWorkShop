package encapsulation;

public class Employee 
{
private int a;
private String name;
private double salary;
public Employee(int a, String name, double salary)
{
	super();
	this.a = a;
	this.name = name;
	this.salary = salary;
}
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}


}
