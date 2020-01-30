package strings;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="sai";
		char ch[]=s1.toCharArray();
		int i;
		for(i=0;i<ch.length/2;i++);
		{
			char c1=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=c1;
		}
		String s2=new String(ch);
		System.out.println(s2);

	}

}
