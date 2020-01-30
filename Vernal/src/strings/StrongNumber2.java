package strings;

public class StrongNumber2 {
	public static int isfact(int num)
	{
		int out=1;
		for (int i=num;i>1;i--)
		{
			out=out*i;
		}
		return out;
	}
public static boolean isstrong(int num)
{
	int res=0;
	int t=num;
	while(num!=0)
	{
	int rem=num%10;
	res=res+isfact(rem);
	num=num/10;
	}
	return(t==res);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10000;i++)
		{
		boolean out=isstrong(i);
		if(out)
		System.out.println(i);
}
	}
}

