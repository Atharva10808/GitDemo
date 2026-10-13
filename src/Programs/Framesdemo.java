package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Framesdemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(0);
		Actions a= new Actions(driver);
		WebElement source = driver.findElement(By.id("dragaable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		
		
	

	}

}
