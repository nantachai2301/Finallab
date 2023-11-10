
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DandDPractice2 {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://webdriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.get("http://www.globalsqa.com/demo-site/draganddrop");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		
		
		By drop = By.xpath("//*[@id='trash']");
		WebElement to = driver.findElement(drop);
//		System.out.println("Before : "+to.getText());

		
		Actions act = new Actions(driver);
		for(int i =0;i<4;i++) {
		Thread.sleep(2000);
		By drag = By.xpath("//*[@id='gallery']/li[1]/img");
		WebElement from = driver.findElement(drag);
			
			
		act.dragAndDrop(from, to).build().perform();
		}
//		System.out.println("After : "+to.getText());
		
		
		
		Thread.sleep(5000);
		driver.close();
		System.out.println(" Finish !!!");
		
		
				
	}
	

}