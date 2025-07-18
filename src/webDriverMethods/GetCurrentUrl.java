package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		//launch the browser
		WebDriver driver=new EdgeDriver();
		//naviagate to an application
		driver.get("https://www.chess.com/");
		//fetch the url of the webpages
		String url=driver.getCurrentUrl();
		//print the url
		System.out.println(url);
		
	}

}
