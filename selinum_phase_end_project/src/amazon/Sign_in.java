package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sign_in {

	public static void main(String[] args) {


		//1)open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//2)maximize it
		driver.manage().window().maximize();
		

        // Open Amazon website
        driver.get("https://www.amazon.com");

        // Verify if the user is signed in
        WebElement accountListElement = driver.findElement(By.id("nav-link-accountList"));
        String accountListText = accountListElement.getText();

        if (accountListText.contains("Hello, Sign in")) {
            System.out.println("User is not signed in.");
        } else {
            System.out.println("User is signed in.");
        }

        // Close the browser
        driver.quit();
    }
}
