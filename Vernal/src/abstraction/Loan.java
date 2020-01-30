package abstraction;

public class Loan implements Account
{
	int acnum;
	String acname;
	double bal;
	Loan(int acnum,String acname,double bal)
	{
		this.acnum=acnum;
		this.acname=acname;
		this.bal=bal;
	}
	public void withdraw(double amt)
	{
		bal=bal+amt;
		{
		System.out.println("extra loan taken="+amt);
	}
	}
	public void deposit(double amt)
	{
		if(bal>=amt)
		{
			System.out.println("loan repaid="+amt);
		}
		else
		{
			System.out.println("bal="+amt);
		}
	}
	@Override
	public void checkbal() {
		// TODO Auto-generated method stub
		
	}
}
