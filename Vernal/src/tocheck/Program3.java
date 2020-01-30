package tocheck;
class Paymentsapp
{
	public void pay()
	{
		System.out.println("to pay....");
	}
}
class Paytm extends Paymentsapp
{
	public void movie() {
		System.out.println("to pay movie....");
	}
	public void food()
	{
		System.out.println("to pay food....");
	}
}
class Phonepe extends Paymentsapp
{
	public void shopping() {
		
	}
}
public class Program3{
	public static void main(String []args)
	{
		Paytm p=new Paytm();
		p.movie();
		p.food();
		p.pay();
		Phonepe p1=new Phonepe();
		p1.shopping();
		p1.pay();
	}
}

