package html;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingRelativePath {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver=new EdgeDriver();
		
		//maximize the Browser
		driver.manage().window().maximize();
		
		//naviage to application
		driver.get("file:///C:/Users/dives/OneDrive/Desktop/sampleHtml.html");
		
		//find username field and pass username
		driver.findElement(By.xpath("//input[1]")).sendKeys("David");
		
		//find password field and pass password
		driver.findElement(By.xpath("//input[2]")).sendKeys("david1435");
		
		//find Cancel button and click it
		driver.findElement(By.xpath("//button[2]")).click();
		
		Thread.sleep(3000);
		
		//close the application
		driver.quit();
		

	}

}
