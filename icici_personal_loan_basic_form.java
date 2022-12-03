package referloan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class icici_personal_loan_basic_form {
	

	public static void main(String[] args) throws InterruptedException {
		
		//driver setup
		 
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions builder = new Actions(driver);
		driver.get("https://qa.referloan.in");
		
		WebElement loan = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/a"));
		WebElement PL = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[1]/a"));
		Actions act = new Actions(driver);
		
		builder.moveToElement(loan).perform();
		builder.moveToElement(PL).perform();
		
		driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[1]/div/ul/li[14]/a")).click();
		Thread.sleep(2000);
		
//		basic details
		
		driver.findElement(By.name("full_name")).sendKeys("Test qa");
		Thread.sleep(1000);
		driver.findElement(By.name("phone_no")).sendKeys("9717106422");
		Thread.sleep(1000);
		driver.findElement(By.id("otpCheckbox")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("mt-4")).click();
		Thread.sleep(10000);
		driver.findElement(By.className("mt-4")).click();
		Thread.sleep(2000);
		
//		otp click
		
		driver.findElement(By.xpath("//button[@class= 'mt-4' and contains(.,'verify OTP')]")).click();
		Thread.sleep(2000);
		
		                                          // First Step Form
//		form information
		
		driver.findElement(By.id("demo-simple-select-standard")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-title\"]/div[3]/ul/li[1]")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("full_name")).sendKeys("Test Qa");
		Thread.sleep(500);
		driver.findElement(By.id("phone_number")).sendKeys("9717156422");
		Thread.sleep(500);
		driver.findElement(By.id("email")).sendKeys("Test123@gmail.com");
		Thread.sleep(500);
//		gender
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form[2]/div[1]/div[5]/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
		
		driver.findElement(By.id("pan")).sendKeys("TESTR3456R");
		
//		 Marital status
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form[2]/div[1]/div[6]/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
		
		driver.findElement(By.id("residence_pincode")).sendKeys("293121");
		
//		Residence type
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form[2]/div[1]/div[8]/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.id("residence_city")).sendKeys("Noida");
		
		//Qualification
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form[2]/div[1]/div[11]/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[5]")).click();
		Thread.sleep(500);
		
		//occupation
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form[2]/div[1]/div[12]/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[3]")).click();
		Thread.sleep(500);
		
		//Number of Dependents
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form[2]/div[1]/div[13]/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form[2]/div[2]/button")).click();
		Thread.sleep(3000);
		
		                                          // Second Step
		//emp. type
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form[2]/div[1]/div[1]/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[3]")).click();
		
		//type of company
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form[2]/div[1]/div[2]/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
		
		driver.findElement(By.id("company_phone_no")).sendKeys("9876543210");
		
		//designation
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form[2]/div[1]/div[6]/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[4]")).click();
		
		//doc type
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form[2]/div[1]/div[7]/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[4]")).click();
		
		driver.findElement(By.id("document_number")).sendKeys("294427432345");
		
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form[2]/div[2]/button")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
