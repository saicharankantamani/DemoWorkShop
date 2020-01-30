package collections;

import java.util.*;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.println("main method started");
//ArrayList al=new ArrayList();
		LinkedList al=new LinkedList();
int size=al.size();
System.out.println("size="+size);
Holidays h1=new Holidays("holy",25);
Holidays h2=new Holidays("Diwali",30);
Movie1 m1=new Movie1("hero",2.222,2.2f);
Capgemani c1=new Capgemani(3,4,5);
al.add(h1);
al.add(h2);
al.add(m1);
al.add(c1);

for(int i=0;i<al.size();i++)
{
	Object ob=al.get(i);

	System.out.println(ob);
}
	}}
