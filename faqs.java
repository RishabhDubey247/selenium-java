package referloan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class faqs {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver_win32_2\\chromedriver.exe");
		
//		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		Actions builder = new Actions(driver); 
		driver.manage().window().maximize();
		driver.get("https://qa.referloan.in");
		Thread.sleep(1000);
		
		WebElement loan = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/a"));
		WebElement BL = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[4]/a"));
		Thread.sleep(2000);
		//Actions act = new Actions(driver);
//		
//		builder.moveToElement(loan).perform();
//		builder.moveToElement(BL).perform();
		WebElement prourl = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[4]/div/ul/li[last()]/a"));
		String url = prourl.getAttribute("href");
		System.out.println(url);
		Thread.sleep(1000);
		
		// founder loop
		for(int i=1; i<=50;i++) {
		WebElement foundurl = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[4]/div/ul/li["+i+"]/a"));
		String newurl = foundurl.getAttribute("href");
		driver.get(newurl);
		System.out.println(newurl);
		Thread.sleep(2000);
		
		// scroll
		WebElement faq = driver.findElement(By.xpath("/html/body/div/div/section[3]/div/h2"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", faq);
		Thread.sleep(2000);
		
		// faq founder 
		
		faq = driver.findElement(By.xpath("/html/body/div/div/section[3]/div/div/div[1]/div[3]/h2/button"));
		String findfaq = faq.getText();
		System.out.print(findfaq);
		if (newurl.equals(url)) {
			System.out.print("Working");
			Thread.sleep(1000);
			break;
		}
		
		}
		driver.quit();
	}

}
