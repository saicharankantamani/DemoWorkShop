package patterns;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=4;

for(int i=1;i<=n;i++)
{
	for(int j=1;j<2*i ;j++)
	{
		
		System.out.print(j+i-1);
	}
	
	for(int j=i-1;j>=1;j--)
	{
		System.out.print  (j);
	}
	System.out.println(" ");
}
System.out.println();
	

}
}
