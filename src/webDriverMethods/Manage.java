package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Manage {

	public static void main(String[] args) throws InterruptedException {
		
		//launch browser
		WebDriver driver=new EdgeDriver();
		
		//maximize the window of browser
		driver.manage().window().maximize();
		
		//naviagate to an application
		driver.get("https://www.abhibus.com/");
		
		//minimizing the window of the browser
//		driver.manage().window().minimize();
		
		//waiting 3s
//		Thread.sleep(3000);
		
		//making the window to maximize
		driver.manage().window().maximize();
		
		//waiting 3s
		Thread.sleep(2000);
		
		//full screen the window of the  browser
		driver.manage().window().fullscreen();
		
		//to get dimensions of the window
		
		Dimension d=driver.manage().window().getSize();
		System.out.println(d);
	
		//printing the width
		int width=d.getWidth();
		System.out.println("width : "+width);
		
		//fetching the height
		int height=d.getHeight();
		System.out.println("height: "+height);
		
		//fetching the position of the window
		Point p=driver.manage().window().getPosition();
		System.out.println(p);
		
		//fetch the position of x and y
		int xaxis=p.getX();
		int yaxis=p.getY();
		System.out.println(xaxis);
		System.out.println(yaxis);
		
		
		

	}

}
