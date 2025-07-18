package webDriverMethods;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SettingWindowSize {

	public static void main(String[] args) {
		//launch the browser
		WebDriver driver=new EdgeDriver();
		
		//maximize the window of browser
		driver.manage().window().maximize();
		
		//navigate to application
		driver.get("https://www.flipkart.com/");
		
		
		//fetching the size of the browser before setting dimension
		System.out.println("Before dimensions: "+driver.manage().window().getSize());
		
		//set dimensions
		Dimension dim=new Dimension(100,100);
		driver.manage().window().setSize(dim);
		
		//fetching the size after setting the dimension
		System.out.println("After dimensions: "+driver.manage().window().getSize());
		
		//fetching the position Before setting the position 
		System.out.println("Before position: "+driver.manage().window().getPosition());
		
		//set the position
		Point p=new Point(100, 200);
		driver.manage().window().setPosition(p);
		
		//fetching the position Before setting the position 
		System.out.println("After position: "+driver.manage().window().getPosition());
	}

}
