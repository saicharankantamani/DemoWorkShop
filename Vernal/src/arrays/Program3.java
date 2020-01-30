   package arrays;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] ar= {23,45,56,78,89};
int ele=100;
int index=3;
int nar[]=new int[ar.length+1];
nar[index]=ele;
for(int i=0;i<index;i++)
{
	nar[i]=ar[i];
}
for(int i=index+1;i<nar.length;i++)
{
	nar[i]=ar[i-1];
}
System.out.println("given array is");
for(int i=0;i<ar.length;i++)
{
	System.out.println(ar[i]);
}
System.out.println("new array is");
for(int i=0;i<nar.length;i++)
{
	System.out.println(nar[i]);
}
	}

}
