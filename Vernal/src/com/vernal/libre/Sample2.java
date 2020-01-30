package com.vernal.libre;
class Program2
{
	@Override
	public  int hashCode()
	{ 

	return 23;
}
}

public class Sample2 {
	
	public static void main(String[] args)
	{
		Program2 ref=new Program2();
		int ref1=ref.hashCode();
		System.out.println("ref.hashCode()="+ref1);
		System.out.println("ref="+ref);
		// TODO Auto-generated method stub

	}

}
