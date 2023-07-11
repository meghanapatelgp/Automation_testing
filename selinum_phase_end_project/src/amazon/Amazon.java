package amazon;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon{

	public static void main(String[] args) {
		//1.opern the browser
       ChromeDriver driver=new ChromeDriver();
       
		//2.maximize the window
		driver.manage().window().maximize();
		
		//3. navigate to the amazon website
		driver.get("https://www.amazon.in/");
		
		//4.click on "Mobles" in the navigation window
		driver.findElement(By.linkText("Mobiles")).click();
		
		 //5.hover the pointer over 'Mobiles and Accessories'
        WebElement mobiles= driver.findElement(By.cssSelector("#nav-subnav > a:nth-child(2) > span.nav-a-content"));
		Actions actions =new Actions(driver);
		actions.moveToElement(mobiles).build().perform();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));   
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Apple")));
		
		//6.click on "Apple"in the submenu
		driver.findElement(By.linkText("Apple")).click();
		
	//7.click on the first available phone
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[2]/span/a/div/img")).click();
	
	// 8. switch the focus on new tab
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());	
		driver.switchTo().window(tabs.get(1));
		
		//9.click on buy now button
		driver.findElement(By.id("buy-now-button")).click();
		
		//10. verify user sees the text"Sign in" 
		WebElement signInElement=driver.findElement(By.id("ap_email"));
		
		if(signInElement.isDisplayed())
		{
			System.out.println("user not signed in");
		}
		else
		{
			System.out.println("user is signed in ");
		}	
		driver.quit();
	}

}
