package referloan;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class kreditbee {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		 FirefoxOptions options = new FirefoxOptions();
//	     WebDriver driver = new FirefoxDriver(options);
		Actions builder = new Actions(driver); 
		driver.manage().window().maximize();
		driver.get("https://qa.referloan.in");
		Thread.sleep(5000);
		
		WebElement loan = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/a"));
		WebElement PL = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[1]/a"));
		Actions act = new Actions(driver);
		
//		driver.findElement(By.id("salary")).sendKeys("45000");
//		driver.findElement(By.id("pincode")).sendKeys("201310");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
		
		builder.moveToElement(loan).perform();
		builder.moveToElement(PL).perform();
		driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[1]/div/ul/li[12]/a")).click();
		
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		driver.findElement(By.name("full_name")).sendKeys("Rishabh Dubey");
		Thread.sleep(1000);
		driver.findElement(By.name("phone_no")).sendKeys("9717156422");
		Thread.sleep(1000);
		driver.findElement(By.id("otpCheckbox")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("mt-4")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("mt-4")).click();
		
//		otp click
		final JDialog dialog = new JDialog();
	    dialog.setAlwaysOnTop(true);
	    String otp = JOptionPane.showInputDialog(dialog, "Please enter your otp", "Enter product name", JOptionPane.INFORMATION_MESSAGE);
	    driver.findElement(By.name("otp")).sendKeys(""+otp+"");
		driver.findElement(By.xpath("//button[@class= 'mt-4' and contains(.,'verify OTP')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("mobile")).sendKeys("9717156422");
		driver.findElement(By.name("email")).sendKeys("testr@gmail.com");
		driver.findElement(By.name("pan")).sendKeys("TESTD7567D");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[6]/div[3]/div/div")).click(); 
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
		Thread.sleep(2000);
		
		// second step
		driver.findElement(By.name("pincode")).sendKeys("203121");
		WebElement dob = driver.findElement(By.id("dob"));
		act.doubleClick(dob).perform();
		driver.findElement(By.id("dob")).sendKeys("04-05-1971");
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[4]/div[3]/div/div")).click(); 
		driver.findElement(By.xpath("//html/body/div[2]/div[3]/ul/li[2]")).click();
		
		driver.findElement(By.name("salary")).sendKeys("45000");
		driver.findElement(By.name("company")).sendKeys("Referlaon");
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
		Thread.sleep(2000);
		

	}

}
