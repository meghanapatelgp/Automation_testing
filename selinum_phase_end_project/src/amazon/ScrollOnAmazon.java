package amazon;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class ScrollOnAmazon {
	    public static void main(String[] args) {
	        

	        // Launch Chrome browser
	        WebDriver driver = new ChromeDriver();

	        // Open Amazon website
	        driver.get("https://www.amazon.com");

	        // Scroll to the bottom of the page
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	        // Wait for a while to observe the scroll
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Scroll back to the top of the page
	        jsExecutor.executeScript("window.scrollTo(0, 0)");

	        // Wait for a while to observe the scroll
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Close the browser
	        driver.quit();
	    }
	}

