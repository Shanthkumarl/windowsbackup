package allAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mhouseover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoapp.skillrary.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebElement mh = driver.findElement(By.id("course"));
	    Actions a=new Actions(driver);
	    a.moveToElement(mh).perform();
	    driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
	    
	   WebElement doublee = driver.findElement(By.id("add"));
	   a.doubleClick(doublee).perform();
	   
 WebElement rc = driver.findElement(By.xpath("//button[text()=' Add to Cart']"));
	   a.contextClick(rc).perform();

	}

}
