package Assignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_assignment {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("srihari@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("9247180039");
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")).click();
		
		WebElement women=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(women).perform();

		driver.findElement(By.linkText("T-shirts")).click();
		WebElement button=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		WebElement More=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]/span"));
		Actions act1=new Actions(driver);
		act1.moveToElement(button).moveToElement(More).click().perform();
		

		driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span")).click();
		WebElement ddown=driver.findElement(By.id("group_1"));
		Select select =new Select(ddown);
		select.selectByValue("3");
		select.selectByVisibleText("L");
		select.selectByIndex(2);
		driver.findElement(By.id("color_13")).click();
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
		
		}

}
