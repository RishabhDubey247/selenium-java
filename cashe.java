package referloan;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cashe {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions builder = new Actions(driver); 
		driver.manage().window().maximize();
		driver.get("https://qa.referloan.in");
		Thread.sleep(1000);
		Robot robot = new Robot();
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		
		WebElement loan = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/a"));
		WebElement PL = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[1]/a"));
		Actions act = new Actions(driver);
		
		builder.moveToElement(loan).perform();
		builder.moveToElement(PL).perform();
		driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[1]/div/ul/li[11]/a")).click();
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.name("full_name")).sendKeys("Rishabh Dubey");
		Thread.sleep(1000);
		driver.findElement(By.name("phone_no")).sendKeys("9717156422");
		Thread.sleep(1000);
		driver.findElement(By.id("otpCheckbox")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("mt-4")).click();
		
//		otp click
		final JDialog dialog = new JDialog();
	    dialog.setAlwaysOnTop(true);
	    String otp = JOptionPane.showInputDialog(dialog, "Please enter your otp", "Enter product name", JOptionPane.INFORMATION_MESSAGE);
	    driver.findElement(By.name("otp")).sendKeys(""+otp+"");
		driver.findElement(By.xpath("//button[@class= 'mt-4' and contains(.,'verify OTP')]")).click();
		
		// 1st step 
		
		Thread.sleep(1000);
		driver.findElement(By.name("emailId")).sendKeys("tester34@gmail.com");
		driver.findElement(By.name("mobileNo")).sendKeys("9717156422");
		driver.findElement(By.name("loanAmount")).sendKeys("250000");
		Thread.sleep(1000);
		WebElement dob = driver.findElement(By.id("DOB"));
		act.doubleClick(dob).perform();
		driver.findElement(By.id("DOB")).sendKeys("04-05-1942");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mui-component-select-gender\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.id("addressLine1")).sendKeys("Dummy area 123");
		driver.findElement(By.id("Address Line 2")).sendKeys("Dummy area 123");
		driver.findElement(By.id("Landmark  (Address Line 3)")).sendKeys("Dummy area 123");
		driver.findElement(By.id("pinCode")).sendKeys("201301");
		driver.findElement(By.id("city")).sendKeys("NOida");
		driver.findElement(By.id("State")).sendKeys("UP");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mui-component-select-Type of Accommodation\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("pan")).sendKeys("TESTJ9352H");
		driver.findElement(By.name("Aadhaar")).sendKeys("265987534623");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"mui-component-select-Highest Qualification\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"mui-component-select-residing_with\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"mui-component-select-number_of_years_at_current_address\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[3]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"mui-component-select-marital_status\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"mui-component-select-spouse_employment_status\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"mui-component-select-number_of_kids\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
		
		// 2nd step
		Thread.sleep(2000);
		driver.findElement(By.name("companyName")).sendKeys("Referloan");
		driver.findElement(By.name("Office Phone no")).sendKeys("9876789756");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[15]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.name("Monthly Income")).sendKeys("55000");
		driver.findElement(By.name("Number of Years in CurrentWork")).sendKeys("4");
		driver.findElement(By.name("Official Email")).sendKeys("test56@gmail.com");
		driver.findElement(By.name("Office Address 1")).sendKeys("Dummy area 123");
		driver.findElement(By.name("Office Pincode")).sendKeys("201301");
		driver.findElement(By.name("Office City")).sendKeys("Noida");
		driver.findElement(By.name("Office State")).sendKeys("UP");
		driver.findElement(By.name("Working Since")).sendKeys("2018");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[70]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[75]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[80]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[85]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[90]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
		
		// 3rd step
		Thread.sleep(2000);
		driver.findElement(By.name("Primary Existing BankName")).sendKeys("PNB");
		driver.findElement(By.name("Account number")).sendKeys("8493737392");
		driver.findElement(By.name("IFSC Code")).sendKeys("PUNB079990");
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
		
		// 4th step
		Thread.sleep(2000);
		driver.findElement(By.name("Primary Existing Bank Name")).sendKeys("PNB");
		driver.findElement(By.name("Account number")).sendKeys("8493737392");
		driver.findElement(By.name("IFSC Code")).sendKeys("PUNB079990");
		driver.findElement(By.name("Remarks")).sendKeys("This is a test");
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
		
		//5th step
		Thread.sleep(1000);
		driver.findElement(By.name("locality")).sendKeys("Noida");
		driver.findElement(By.name("salary")).sendKeys("50000");
		driver.findElement(By.name("Email Id")).sendKeys("test32@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();

		
		//6th step 
		Thread.sleep(1000);
		driver.findElement(By.name("co")).sendKeys("Test");
		driver.findElement(By.name("street")).sendKeys("Noida");
		driver.findElement(By.name("house")).sendKeys("Noida");
		driver.findElement(By.name("lm")).sendKeys("Noida");
		driver.findElement(By.name("vtc")).sendKeys("Noida");
		driver.findElement(By.name("subdist")).sendKeys("Noida");
		driver.findElement(By.name("dist")).sendKeys("Noida");
		driver.findElement(By.name("state")).sendKeys("UP");
		driver.findElement(By.name("pc")).sendKeys("201301");
		driver.findElement(By.name("po")).sendKeys("Noida");
		driver.findElement(By.name("aadhar_no")).sendKeys("265987534623");
		driver.findElement(By.name("name")).sendKeys("Rishabh Dubey");
		Thread.sleep(1000);
		WebElement dob2 = driver.findElement(By.id("dob"));
		act.doubleClick(dob2).perform();
		driver.findElement(By.id("dob")).sendKeys("04-05-1942");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[70]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
		driver.findElement(By.name("compressed-address")).sendKeys("Noida");
		
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();



		
		
	}

}
