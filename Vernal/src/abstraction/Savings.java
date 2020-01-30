package abstraction;

public  class Savings implements Account
{
	int acnum;
	String acname;
	double bal;
	Savings(int acnum,String acname,double bal)
	{
		this.acname=acname;
		this.acnum=acnum;
		this.bal=bal;
	}
	public void deposit(double amt)
	{
		bal=bal+amt;
	System.out.println("amt="+amt);
	}
	public void withdraw(double amt)
	{
		if(amt<=bal)
		{
			System.out.println("take your money");
		}
		else
		{
			System.out.println("go and deposit money");
		}
		
		
	}
	@Override
	public void checkbal() {
		// TODO Auto-generated method stub
		
	}

}
