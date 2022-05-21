package Package1;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptexecution {

	

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		// we have to create the java script referance
		
		JavascriptExecutor js=(JavascriptExecutor)driver;// we are typecasting the driver into java script executor
		js.executeScript("alert('welcome to the chrome')");
	 
		//js.executeScript("Prompt('enter the name')");
		
	}

}
