package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("main method started");
		HashSet hs=new HashSet();
		hs.add("D");
		hs.add("B");
		hs.add("C");
		hs.add("B");
		hs.add("A");
		hs.add("g");
		hs.add("k");
		hs.add(1);
		hs.add(0);
		hs.add("z");
		System.out.println("size="+hs.size());
		/*Iterator ref=hs.iterator();
		while(ref.hasNext());
		Object ob=ref.next();*/
		for(Object ob:hs)
		{
		System.out.println(ob);
		}
		System.out.println("main method ended");

	}

}
