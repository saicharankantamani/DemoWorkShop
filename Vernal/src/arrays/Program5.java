package arrays;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []ar= {1,2,3,2,1,3,5,6};
for(int i=0;i<ar.length;i++)
{
	System.out.println(ar[i]);
}
int n=ar.length;
for(int i=0;i<n;i++)
{
	for(int j=i+1;i<n;j++)
	{
		if(ar[i]==ar[j])
		{
			int k=j;
		while(k<n-1)
		{
			ar[k]=ar[k-1];
			k++;
			
		}
		n--;
		j--;
	}
			
	}
}
	int []nar=new int[n];
	for (int i=0;i<n;i++)
	{
		nar[i]=ar[i];
	}
System.out.println("the delated array is");
for(int i=0;i<nar.length;i++)
	{
	System.out.println(nar[i]);
	}
	}
}