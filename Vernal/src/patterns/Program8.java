package patterns;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stuint
		
		int n=3;
for(int i=0;i<n;i++)
{
	for (int space=0;space<n-1-i;space++)
	{
		System.out.print("  ");
	}
	for(int j=0;2*i>=j;j++)
	{
		System.out.print("* ");
	}

	System.out.println();

	}
for(int i=n-2 ;i>=0;i--)
{
	for (int space=0;space<n-1-i;space++)
	{
		System.out.print("  ");
	}
	for(int j=0;2*i>=j;j++)
	{
		System.out.print("* ");
	}

	System.out.println();

	}
}

}
