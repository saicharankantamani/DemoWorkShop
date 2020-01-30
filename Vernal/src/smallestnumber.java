
public class smallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {12,-56,46,55,8989,0,223,-1000};
		int min=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println("small number is ="+min);
	}

}
