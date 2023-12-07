package week3.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.ajio.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Bags");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@class='ic-search']")).click();
			driver.findElement(By.xpath("//div/label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//div/label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
			Thread.sleep(5000);
			WebElement text1 = driver.findElement(By.xpath("//div[@class='length']"));
			System.out.println(text1.getText());
			
			driver.findElement(By.xpath("//span[contains(text(),'brands')]")).click();
			
	List<WebElement> brand1 = driver.findElements(By.xpath("//div[@class='brand']"));
	for (int i = 0; i < brand1.size(); i++) {
	 System.out.println(brand1.get(i).getText());
	 
	 List<WebElement> bags = driver.findElements(By.xpath("//div[@class='nameCls']"));
			
	 for (int j = 0; j<bags.size(); j++) {
		 System.out.println(bags.get(j).getText());
	}
		}
			
	}

}
