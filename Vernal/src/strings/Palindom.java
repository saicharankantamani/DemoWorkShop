package strings;

public class Palindom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res = 0,num=123456145;
		int temp=num;
		int sum=0;
		  while(num!=0)
		  {
			 res=num%10;
		  sum=(sum*10)+res;
		  num=num/10;
		  }
		  if(sum==temp)
		  {
			  System.out.println("palindrom");
		  }
		  else
		  {
			  System.out.println("not palindrom");
		  }

	}

}
