
public class greaterarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {25,54,45,545,789};
		int max=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println("Largest number is="+max);
	}

}
