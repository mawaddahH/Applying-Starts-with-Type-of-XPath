package ass1StartswithXPath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromWebDriver {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 */

	@BeforeTest
	public void setUp() {
		// the path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		// Navigate to a WebSite
		driver.navigate().to("https://elements.envato.com/");

		// Maximize current window
		driver.manage().window().maximize();
	}

	/**
	 * Test using 'Starts-with' Type of XPath
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {

		// ex1 ------- Basic starts-with() Function
		WebElement startsWithMethod1 = driver
				.findElement(By.xpath("//a[starts-with(@aria-label,'See all Video templates')]"));
		startsWithMethod1.click();
		System.out.println("ex1 DONE Successfully");
		
		// Delay execution for 3 seconds to see the result carefully.
		Thread.sleep(3000);

		// ex2 ------- starts-with() Function & AND operation
		WebElement startsWithMethod2 = driver
				.findElement(By.xpath("//option[starts-with(text(),'New') and starts-with(@aria-label,'New')]"));
		startsWithMethod2.click();
		System.out.println("ex2 DONE Successfully");

		// Delay execution for 3 seconds to see the result carefully.
		Thread.sleep(3000);

		// ex3 ------- starts-with() Function & Child concept
		WebElement startsWithMethod3 = driver
				.findElement(By.xpath("//li[starts-with(@class,'oY1zDR5h')]//child::a[starts-with(text(),'Fonts')]"));
		startsWithMethod3.click();
		System.out.println("ex3 DONE Successfully");
		
		// Delay execution for 3 seconds to see the result carefully.
		Thread.sleep(3000);
		
		// ex4 ------- starts-with() Function & OR operation
		WebElement startsWithMethod4 = driver
				.findElement(By.xpath("//input[starts-with(@id,'autosuggest') or starts-with(@class,'DEjNaCG_')]"));
		startsWithMethod4.sendKeys("Mawaddah");
		System.out.println("ex4 DONE Successfully");
		
		// Delay execution for 3 seconds to see the result carefully.
		Thread.sleep(3000);
	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.quit();
	}
}
