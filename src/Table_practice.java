import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_practice {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://webdriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table = driver.findElement(By.id("customers"));
		
		List<WebElement> thlist = table.findElements(By.tagName("th"));
		
		for(WebElement th: thlist) {
			
			System.out.print("\t\t"+th.getText());
		}
		
		List<WebElement> trlist = table.findElements(By.tagName("tr"));
		
		for(WebElement tr: trlist) {
			System.out.println("");
			List<WebElement> tdlist = tr.findElements(By.tagName("td"));
			
			for(WebElement td: tdlist) {
				
				System.out.print("\t\t"+td.getText());
			}
			System.out.println("");
		}
		
		
		Thread.sleep(500);
		driver.close();
		System.out.println(" Finish !!!");
		
	}
	

}