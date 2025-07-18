package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		//launch the browser
		WebDriver driver=new EdgeDriver();
		//naviagate to an application
		driver.get("https://www.chess.com/");
		//fetch the title of the webpages
		String title=driver.getTitle();
		System.out.println(title);

	}

}
