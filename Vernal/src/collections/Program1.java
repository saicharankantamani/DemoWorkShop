package collections;

import java.util.TreeSet;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Movie m1=new Movie("pailwan",5.4,45);
Movie m2=new Movie("shiva",3.1,31);
Movie m3=new Movie("evaru",4.2,99);
Movie m4=new Movie("yevadu",5.5,88);
Movie m5=new Movie("athadu",2.1,23);
Movie m6=new Movie("aame",3.9,77);
Movie m7=new Movie("aa intlo",3.5,100);
Movie m8=new Movie("pailwan",5.6,45);
TreeSet<Movie> ts=new TreeSet<Movie>();
ts.add(m1);
ts.add(m2);
ts.add(m3);
ts.add(m4);
ts.add(m5);
ts.add(m6);
ts.add(m7);
ts.add(m8);
for(Object ob:ts)
{
	System.out.println(ob);
}


	}

}
