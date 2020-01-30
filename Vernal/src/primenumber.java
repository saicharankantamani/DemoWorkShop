import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input =sc.nextInt();
		boolean prime =true;
		for(int i=2;i<input;i++)
		{
			if(input%i==0)
			{
				 prime = false;
			}
		}
		if(prime==false)
		{
			System.out.println(input+"is not prime number");
		}
		else
		{
			System.out.println(input+"is prime number");
		}
	}

}
