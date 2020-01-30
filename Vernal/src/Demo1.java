class Demo1
{
	Demo1()
	{
	System.out.println("zero");
	}
	Demo1(int a)
	{
		this();
		System.out.println("a="+a);
	}
	Demo1(double b)
	{
this(65);

System.out.println("b="+b);
	}
}
class mainclass2
{
	public static void main(String[] args) 
	{
		Demo1 ref1=new Demo1();
		Demo1 ref2=new Demo1(6);
		Demo1 ref3=new Demo1(6.5);
	}
}

