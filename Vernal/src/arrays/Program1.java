package arrays;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {100,200,300,400,500,600};
		int max=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(max<ar[i])
			{
				max=ar[i];
		}

	}
System.out.println(max);
}
}
