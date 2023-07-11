package amazon;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class LocateWebElements {
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Launch Chrome browser
	        WebDriver driver = new ChromeDriver();

	        // Open Amazon website
	        driver.get("https://www.amazon.com");

	        // Locate and interact with web elements
	        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	        searchBox.sendKeys("Laptop");

	        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
	        searchButton.click();

	        WebElement firstProduct = driver.findElement(By.xpath("//div[@data-component-type='s-search-result'][1]//a[@class='a-link-normal']"));
	        String productTitle = firstProduct.getText();
	        System.out.println("First product title: " + productTitle);

	        // Close the browser
	        driver.quit();
	    }
	}

