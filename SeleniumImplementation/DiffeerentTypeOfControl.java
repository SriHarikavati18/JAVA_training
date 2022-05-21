package Package1;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class DiffeerentTypeOfControl {

	public static void main(String[] args) throws InterruptedException {// we have to mention the throws interrupted execution while  using Thread.sleep()
		WebDriverManager.firefoxdriver().setup();
	
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8686870420");
		
		String str=driver.findElement(By.linkText("Forgotten password?")).getText();
		System.out.println(str);
		Thread.sleep(2000);
		
		/*boolean b=driver.findElement(By.xpath("login")).isDisplayed();
		boolean c=driver.findElement(By.xpath("login")).isEnabled();
		boolean d=driver.findElement(By.xpath("login")).isSelected();
		System.out.println("is displayed: "+b); 
		System.out.println("is enabled: "+c);
		System.out.println("isSelected: "+d);*/
		driver.findElement(By.id("email")).clear();//it is used to clear the text which is already written
		
	driver.close();

	}

}
