package practise;

public class SortOfarrayascendinorder {
	public static void main(String[] args) {
		
		int  ar[]= {20,45,50,-1,100,-20};
		for(int i=0;i<ar.length-1;i++)
			{
			for (int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
			}
	}
			}
		 for (int i = 0; i < ar.length; i++) {     
	            System.out.println(ar[i]);   
		}
}
}
	
	


