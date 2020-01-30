package collections;

import java.util.PriorityQueue;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method started");
PriorityQueue pq=new PriorityQueue();
College c1=new College("qspiders",3000,80.19f);
College c2=new College("vsvt",2000,70.1f);
College c3=new College("vit",1000,59.19f);
College c4=new College("srm",10000,90.22f);
College c5=new College("svec",1500,60.9f);
College c6=new College("jspiders",500,40.39f);
pq.add(c1);
pq.add(c2);
pq.add(c3);
pq.add(c4);
pq.add(c5);
pq.add(c6);
for(int i=pq.size();i>0;i--)
{
	Object ob=pq.poll();
	System.out.println(ob);
}
PriorityQueue pq1=new PriorityQueue(new sortbasedonname());
System.out.println("output for pq1");
pq1.add(c1);
pq1.add(c2);
pq1.add(c3);
pq1.add(c4);
pq1.add(c5);
pq1.add(c6);
for(int i=pq1.size();i>0;i--)
{
	Object ob=pq1.poll();
	System.out.println(ob);
}
PriorityQueue pq2=new PriorityQueue(new sortbasedonstrength());
System.out.println("output for pq2");
pq2.add(c1);
pq2.add(c2);
pq2.add(c3);
pq2.add(c4);
pq2.add(c5);
pq2.add(c6);
for(int i=pq2.size();i>0;i--)
{
	Object ob=pq2.poll();
	System.out.println(ob);
}


System.out.println("main method ended");
	}

}
