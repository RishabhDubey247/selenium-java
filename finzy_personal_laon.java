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

public class finzy_personal_laon {

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
		driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[1]/div/ul/li[8]/a")).click();
		
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		driver.findElement(By.name("full_name")).sendKeys("Ravi kumar");
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
		
	
		driver.findElement(By.name("pan")).sendKeys("AIAPJ8530A");
		driver.findElement(By.name("phoneNumber")).sendKeys("9667484051");
		driver.findElement(By.name("name")).sendKeys("8971294612");
		
		WebElement dob = driver.findElement(By.id("dateOfBirth"));
		act.doubleClick(dob).perform();
		driver.findElement(By.id("dateOfBirth")).sendKeys("04-05-1971");
		Thread.sleep(1000);
		driver.findElement(By.id("city")).sendKeys("Noida");
		driver.findElement(By.id("state")).sendKeys("UP");
		driver.findElement(By.id("pinCode")).sendKeys("203121");
		driver.findElement(By.id("loanAmount")).sendKeys("500000");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"mui-component-select-employmentType\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[55]/div[3]/div/input")).sendKeys("280000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[50]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
		driver.findElement(By.id("emi")).sendKeys("4500");
		driver.findElement(By.id("creditScore")).sendKeys("7500");
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[70]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
		driver.findElement(By.id("rent")).sendKeys("4500");
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.id("tenure")).sendKeys("24");
		
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[10]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
		
		driver.findElement(By.id("email")).sendKeys("test34@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[20]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[25]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
		driver.findElement(By.id("address")).sendKeys("NOida sector-2");
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[35]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
		driver.findElement(By.id("addressProofNumber")).sendKeys("343245");
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[45]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[50]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.id("company")).sendKeys("Referloan");
		driver.findElement(By.id("totalExperienceMonths")).sendKeys("3");
		
		Thread.sleep(1200);
		
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[15]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
		driver.findElement(By.id("income")).sendKeys("60000");
		
		Thread.sleep(1200);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[25]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[3]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[30]/div[3]/div/div")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[3]")).click();
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
		
		Thread.sleep(1200);
		driver.findElement(By.id("ifscCode")).sendKeys("SBIN0005943");
		driver.findElement(By.id("accountNumber")).sendKeys("564367854");
		driver.findElement(By.id("accountHolderName")).sendKeys("Rishabh Dubey");
		
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[4]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
		
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
		
		Thread.sleep(1500);
		
	}

}
