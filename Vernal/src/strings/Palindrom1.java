package strings;

public class Palindrom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="hah";
char ch[]=s1.toCharArray();
for(int i=0;i<ch.length/2;i++)
{
	char c1=ch[i];
	ch[i]=ch[ch.length-1-i];
	ch[ch.length-1-i]=c1;
}
String s2=new String(ch);


if(s1==s2)
{
	System.out.println("string is palindrom");
}
/*else
{
	System.out.println("string is not palindrom");
}*/
	}

}
