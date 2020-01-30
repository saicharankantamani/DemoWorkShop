package collections;

public class College implements Comparable
{
	String name;
	int strength;
	float passpercentage;
	public College(String name, int strength, float passpercentage) {
		super();
		this.name = name;
		this.strength = strength;
		this.passpercentage = passpercentage;
	
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", strength=" + strength + ","
				+ " passpercentage=" + passpercentage + "]";
	}
	@Override
	public int compareTo(Object ob) {
		// TODO Auto-generated method stub
		College cg=(College)ob;
		return this.strength-cg.strength;
	}
	/*@Override
	public int compare(object ob1,object ob2)
	{
		College cg1=(College)ob1;
		College cg2=(College)ob2;
		return  cg1.namecompareTocg2.name;
	}*/
	
}
