package abstraction;

public class AccountManager {
	public Account createaccount(int num,String name,double balance,char type)
	{
		if(type=='s')
		{
			return new Savings(num,name,balance);
		}
		else
		{
			return new Loan(num,name,balance);
		}
	}

}
