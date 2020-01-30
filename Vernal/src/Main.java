
public class Main {
	String name;
	String ifsc;
	double balance;
	Main()
	{
		name="charan";
		ifsc="123f";
		balance=200000.0;
	}
}
class Main1
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("started");
Main ref=new Main();
System.out.println("name="+ref.name);
System.out.println("ifsc="+ref.ifsc);
System.out.println("balance="+ref.balance);
System.out.println("ended");


	}

}
