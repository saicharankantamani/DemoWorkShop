package tocheck;
 class Sample5
{
	public void test()
	{
		System.out.println("executing test method");
		
	}
}
 class Sample1 extends Sample5
{
	public void test1()
	{
		System.out.println("executing test1 method");
		
	}
}
 class Sample6 extends Sample1
{
	public void test6()
	{
		System.out.println("executing test method sample1");
		
	}
}
 class Sample7 extends Sample6
{
	public void test7()
	{
		System.out.println("executing test1 method sample7");
		
	}
}
public class Program2 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Sample7 s1=new Sample7();
		s1.test1();
		s1.test();
s1.test6();
s1.test7();
	}

}
