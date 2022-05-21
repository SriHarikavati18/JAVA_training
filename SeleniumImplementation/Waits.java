package Package1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		 
		  FirefoxDriver driver= new FirefoxDriver();
		  driver.get("https://www.google.com/");
		  //implicit wait:which tells to wait for some bit of time for to execute the url 
		  //default implicit wait value is zero(0)
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.findElement(By.name("q")).sendKeys("automation step by step"+ Keys.ENTER);
		  
		  //explicit wait 
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));// created the wait class and given duration here 
		WebElement myLink=  wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Training by Raghav")));//.click();
		
		  //we have given a condition for particular element 
		 myLink.click();
		 //fluent wait 
		 Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1))
				 .ignoring(NoSuchElementException.class);
				 
		  
		  driver.close();
		  driver.quit();

	}

}
