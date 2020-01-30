package arrays;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] ar= {54,26,78,100,101,200};
int max1=ar[0];
int max2=ar[1];
for(int i=1;i<ar.length;i++);
{
	if(max1<ar[i])
	{
		max2=max1;
		max1=ar[i];
	
	}
	else if(max2<ar[i])
	{
		max2=ar[i];
	}
}
System.out.println("max1="+max1);
System.out.println("max2="+max2);
	}

}
