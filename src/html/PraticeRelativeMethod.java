package html;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PraticeRelativeMethod {

	public static void main(String[] args) throws InterruptedException {
		//launch browser
		WebDriver driver=new EdgeDriver();
		//maximize the screen
		driver.manage().window().maximize();
		//enter to appllication
		driver.get("https://www.chess.com/login_and_go?returnUrl=https://www.chess.com/home");
		Thread.sleep(3500);
		
		//find username field and enter the username
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("diveshrajdhar78@gmail.com");
		//find password field and enter password
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("david#raj78");
		//find login button and click it
		driver.findElement(By.xpath("(//a)[4]")).click();
		
		Thread.sleep(4000);
		
		//close the application
		driver.close();
		

	}

}
