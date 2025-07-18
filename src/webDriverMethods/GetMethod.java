package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetMethod {

	public static void main(String[] args) {
		//launch the browser
		WebDriver driver=new EdgeDriver();
		//naviagate to an application
		driver.get("https://www.facebook.com/");
		

	}

}
