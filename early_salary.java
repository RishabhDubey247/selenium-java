package referloan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class early_salary {

	public static void main(String[] args) throws InterruptedException {
		
		//driver setup
		 
				System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver_win32_2\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				Actions builder = new Actions(driver); 
				driver.manage().window().maximize();
				driver.get("https://qa.referloan.in");
				Thread.sleep(3000);
				
				WebElement loan = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/a"));
				WebElement PL = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[1]/a"));
				Actions act = new Actions(driver);
				
				builder.moveToElement(loan).perform();
				builder.moveToElement(PL).perform();
				driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[1]/div/ul/li[6]/a")).click();
				
				Thread.sleep(1000);
				
//				basic details
				
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
				
//				otp click
				
				driver.findElement(By.xpath("//button[@class= 'mt-4' and contains(.,'verify OTP')]")).click();
				Thread.sleep(1000);
				
				// step one 
				
				WebElement dob = driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[4]/div[3]/div/input"));
				act.doubleClick(dob).perform();
				driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[4]/div[3]/div/input")).sendKeys("12-12-1999");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[5]/div[3]/div/div")).click();
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
				driver.findElement(By.id("emailid")).sendKeys("test345@gmail.com");
				driver.findElement(By.id("pincode")).sendKeys("342213");
				driver.findElement(By.name("pan")).sendKeys("TESTQ2353Q");
				driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
				
				Thread.sleep(1000);
				// second step 
				
				driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[1]/div[3]/div/div")).click();
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
				
				driver.findElement(By.id("address1")).sendKeys("Area ABC");
				driver.findElement(By.id("address2")).sendKeys("NOIDA");
				driver.findElement(By.id("landmark")).sendKeys("Near Metro Station");
				driver.findElement(By.id("city")).sendKeys("NOIDA");
				driver.findElement(By.id("state")).sendKeys("Uttar Pradesh");
				
				driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[7]/div[3]/div/div")).click();
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
				
				driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[8]/div[3]/div/div")).click();
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
				
				driver.findElement(By.id("fathername")).sendKeys("TEST QA");
				driver.findElement(By.id("mothername")).sendKeys("TEST QA");
				driver.findElement(By.id("highestEducation")).sendKeys("Graduation");
				driver.findElement(By.id("instituteName")).sendKeys("ABC College");
				driver.findElement(By.id("employername")).sendKeys("ABC ptv ltd");
				driver.findElement(By.id("officeaddress")).sendKeys("ABC area noida");
				driver.findElement(By.id("officeCity")).sendKeys("Noida");
				driver.findElement(By.id("officepincode")).sendKeys("201310");
				driver.findElement(By.id("salary")).sendKeys("45000");
				
				WebElement doj = driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[18]/div[3]/div/input"));
				act.doubleClick(doj).perform();
				driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[18]/div[3]/div/input")).sendKeys("12-12-2013");
				Thread.sleep(1000);
				
				driver.findElement(By.id("yoe")).sendKeys("5");
				driver.findElement(By.id("designation")).sendKeys("QA");
				driver.findElement(By.id("type")).sendKeys("3");
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,300)", "");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
				Thread.sleep(5000);
				
				driver.quit();

				
	}

}
