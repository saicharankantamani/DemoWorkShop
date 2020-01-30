package collections;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		HashSet hs =new HashSet();
		hs.add("a");
		hs.add("1");
		hs.add("B");
		hs.add("Z");
		hs.add("1");
		System.out.println("size="+hs.size());
		for(Object ob:hs)
		{
			System.out.println(ob);
		
		}
		System.out.println("main method ended");
	}

}
