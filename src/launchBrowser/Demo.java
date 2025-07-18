package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
	public static void main(String[] args) {
		//Launch chrome Browser
//		ChromeDriver driver = new ChromeDriver();
		//Lauch Edge browser
//		EdgeDriver drivere= new EdgeDriver();

		//Upcast browser specific classes to wewbdriver<<I>> ref variable
		//To achieve Cross Brower Testing 
//		WebDriver driver= new ChromeDriver();
		WebDriver driver=new EdgeDriver();
				
	}

}
