package getter_webelemnt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_loginpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         WebElement text = driver.findElement(By.id("headerContainer"));
        System.out.println(text.getText());
	}

}
