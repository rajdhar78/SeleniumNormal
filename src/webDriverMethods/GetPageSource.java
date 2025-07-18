package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		//lauch the browser
		WebDriver driver=new EdgeDriver();
		//naviagate to an application
		driver.get("https://www.chess.com/");
		//fetch the page source code
		String source=driver.getPageSource();
		System.out.println(source);

	}

}
