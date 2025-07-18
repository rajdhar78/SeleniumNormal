package html;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingAbsolutePath {

	public static void main(String[] args) throws InterruptedException {
		 //launch the browser
		WebDriver driver= new EdgeDriver();
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//navigate to application
		driver.get("file:///C:/Users/dives/OneDrive/Desktop/sampleHtml.html");
		
		//locate username
		WebElement u=driver.findElement(By.xpath("./html/body/input[1]"));
		//pass username
		u.sendKeys("david");
	
		//locate password input and passing password
		driver.findElement(By.xpath("./html/body/input[2]")).sendKeys("david123");
		
		Thread.sleep(3000);
		
		//click on login button
		driver.findElement(By.xpath("./html/body/button[1]")).click();
		
		Thread.sleep(2000);
		
		//close the application
		driver.quit();
	
	
		

	}

}
