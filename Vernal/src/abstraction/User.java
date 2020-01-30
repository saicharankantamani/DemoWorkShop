package abstraction;

public class User 
{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		AccountManager am=new AccountManager();
		Account ac=am.createaccount(123456,"saicharan" ,50000,'0');
		ac.withdraw(5000);
		ac.checkbal();
		ac.deposit(500000);
		ac.checkbal();
		System.out.println("main method ended");
	}

}
