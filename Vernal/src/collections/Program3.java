package collections;

import java.util.TreeSet;

public class Program3 {

	//private static char[] ob;

	public static void main(String[] args)
	{
	System.out.println("main method started");
	TreeSet ts =new TreeSet();
	Examination e1=new Examination("maths",100,99.9f);
	Examination e2=new Examination("java",50,50.9f);
	Examination e3=new Examination("cp",55,60.9f);
	Examination e4=new Examination("m1",60,40.9f);
	Examination e5=new Examination("eee",40,43.9f);
	Examination e6=new Examination("ece",50,80.9f);
	ts.add(e1);
	ts.add(e2);
	ts.add(e3);
	ts.add(e4);
	ts.add(e5);
	ts.add(e6);
	for(Object ob:ts)
	{
		System.out.println(ob);
	}
	TreeSet ts2 =new TreeSet(new sortbasedonpercentage());
	System.out.println("output");
	ts2.add(e1);
	ts2.add(e2);
	ts2.add(e3);
	ts2.add(e4);
	ts2.add(e5);
	ts2.add(e6);
	for(Object ob1:ts2)
	{
		System.out.println(ob1);
		
	}
	System.out.println("main method ended");
	}

}
