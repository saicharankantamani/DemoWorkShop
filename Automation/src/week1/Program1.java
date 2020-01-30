package week1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
ChromeDriver c1=new ChromeDriver();
c1.get("http://amazon.in");
String s=c1.getPageSource();
{
	System.out.println(s);
}
String u=c1.getCurrentUrl();
{
	System.out.println(u);
}
String t=c1.getTitle();
{
	System.out.println(t);
}
c1.close();
	}

}
