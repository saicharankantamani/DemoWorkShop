package arrays;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []ar= {23,45,56,78,89};
int ele=56;
int index=2;
int nar[]=new int[ar.length-1];
for(int i=0;i<index;i++)
{
	nar[i]=ar[i];
}
for(int i=index+1;i<nar.length+1;i++)
{
	nar[i-1]=ar[i];
}
System.out.println("given array is");
for(int i=0;i<ar.length;i++)
{
	System.out.println(ar[i]);
}
System.out.println("new array is");
for (int i=0;i<nar.length;i++)
{
	System.out.println(nar[i]);
}
	}

}
