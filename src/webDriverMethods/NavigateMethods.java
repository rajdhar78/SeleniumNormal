package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver= new EdgeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//naviagte to application
		driver.get("https://www.flipkart.com/");
		
		//identify the login button and click on it
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		Thread.sleep(3000);
		
		//navigate back to the home page
		driver.navigate().back();
		Thread.sleep(3000);
		
		//navigate back to the previous page
		driver.navigate().forward();
		Thread.sleep(3000);
		
		//refresh the login page
		driver.navigate().refresh();
		
		//navigating to new fb page
		driver.navigate().to("https://in.linkedin.com/");
		
		//close it 
//		driver.close();
		driver.quit();

	}

}
