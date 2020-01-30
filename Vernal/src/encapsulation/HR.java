package encapsulation;

public class HR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee(1,"prahas",50000);
System.out.println("id="+e1.getA());
System.out.println("name="+e1.getName());
System.out.println("salary="+e1.getSalary());
e1.setA(24);
e1.setName("charan");
e1.setSalary(1000000);
System.out.println("id="+e1.getA());
System.out.println("name="+e1.getName());
System.out.println("salary="+e1.getSalary());
	}

}
