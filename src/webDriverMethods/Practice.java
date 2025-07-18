package webDriverMethods;

import org.openqa.selenium.Point; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new EdgeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to appli
		driver.get("https://mail.google.com/");
		Thread.sleep(2000);
		
		//set position
		Point p = new Point(300, 400);			
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		//close the browser
		driver.close();

	}

}
