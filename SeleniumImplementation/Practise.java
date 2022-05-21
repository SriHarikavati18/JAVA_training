package Package1;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

//import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		 //System.setProperty("webdriver.chrome.driver","C:\\browser driver\\chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		 
		  FirefoxDriver driver= new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 // driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		 // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com");
		  String originalWindow=driver.getWindowHandle();//variable for the original window which should be declare in earlier
		  driver.navigate().to("https://selenium.dev");
		  driver.navigate().back();
		  driver.navigate().forward();
		  driver.navigate().refresh();
		  driver.switchTo().newWindow(WindowType.WINDOW);//switching to the new window
		  Thread.sleep(1000);
		  driver.switchTo().newWindow(WindowType.TAB);//in the same window it creates the new tab
		  driver.switchTo().window(originalWindow);//for this we have created a local variable above below the  get(url) 
		  driver.close();
	}

}
