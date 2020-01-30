
public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		System.out.println("main method stated");
		for( i=5;i>=1;i--) 
		{
			if(i%2==1)
				 k=1;
			else
				k=i;
			for( j=1;j<=i;j++)
			{ 
				System.out.print(j);
				if(i%2==1)
					k++;
				else 
					k--;
			}
			System.out.println(" ");
		}
		System.out.println("main method ended");

	}

}
