package referloan;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mpokket {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		 FirefoxOptions options = new FirefoxOptions();
//	     WebDriver driver = new FirefoxDriver(options);
		Actions builder = new Actions(driver); 
		driver.manage().window().maximize();
		driver.get("https://qa.referloan.in");
		Thread.sleep(2000);
		
		WebElement loan = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/a"));
		WebElement PL = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[1]/a"));
		Actions act = new Actions(driver);
		
//		driver.findElement(By.id("salary")).sendKeys("45000");
//		driver.findElement(By.id("pincode")).sendKeys("201310");
//		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/form/div[4]/button")).click();
//		Thread.sleep(2000);
		
		builder.moveToElement(loan).perform();
		builder.moveToElement(PL).perform();
		driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[1]/div/ul/li[6]/a")).click();
		
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
		
		try {
			driver.findElement(By.id("email_id")).sendKeys("shayam23@gmail.com");
			driver.findElement(By.name("mobile_no")).sendKeys("9809876732");
//			driver.findElement(By.name("full_name")).sendKeys("Shyam Bharatdwaj");
			driver.findElement(By.name("first_name")).sendKeys("Rishabh");
			driver.findElement(By.name("middle_name")).sendKeys("Dubey");
			WebElement dob = driver.findElement(By.id("date_of_birth"));
			act.doubleClick(dob).perform();
			driver.findElement(By.id("date_of_birth")).sendKeys("04-05-1971");
			Thread.sleep(1000);
			driver.findElement(By.name("last_name")).sendKeys("Dubey");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[7]/div[3]/div/div")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("loan_amount")).sendKeys("450000");
			Thread.sleep(3000);
			driver.findElement(By.name("pancard")).sendKeys("TESTR3453R");
			Thread.sleep(3000);
			driver.findElement(By.name("current_pincode")).sendKeys("201301");
			Thread.sleep(500);
			driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[11]/div[3]/div/div")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
			driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
			
			//second step 
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,200)", "");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[1]/div[3]/div/div")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[2]/div[3]/div/div")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[4]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[3]/div[3]/div/div")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[5]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[3]/div[3]/div/div")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[2]")).click();
			driver.findElement(By.name("company_name")).sendKeys("Referloan"); 
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[5]/div[3]/div/div")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[5]")).click();
			driver.findElement(By.name("company_address")).sendKeys("Noida Sector 2"); 
			driver.findElement(By.name("company_pincode")).sendKeys("201302"); 
			driver.findElement(By.name("company_city")).sendKeys("Noida"); 
			driver.findElement(By.name("company_state")).sendKeys("UP"); 
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[10]/div[3]/div/div")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[3]")).click();
			driver.findElement(By.name("net_monthly_income")).sendKeys("45000");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[12]/div[3]/div/div")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[3]")).click();
			driver.findElement(By.name("net_monthly_income")).sendKeys("45000");
			driver.findElement(By.name("bank_name")).sendKeys("PNB");
			driver.findElement(By.name("current_total_emi_paid_per_month")).sendKeys("4500");
			driver.findElement(By.name("offical_email_id")).sendKeys("testr@referloan.in");
			driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
			
			//third section
			Thread.sleep(2500);
			driver.findElement(By.name("loan_tenure")).sendKeys("24");
			driver.findElement(By.name("enter_fname_as_per_pancard")).sendKeys("Rishabh");
			driver.findElement(By.name("enter_lname_as_per_pancard")).sendKeys("Dueby");
			driver.findElement(By.name("current_address")).sendKeys("Noida sec-69");
			driver.findElement(By.name("current_city")).sendKeys("Noida");
			driver.findElement(By.name("current_state")).sendKeys("UP");
			driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[7]/div[3]/div/div")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
			driver.findElement(By.name("years_stayed_in_current_address")).sendKeys("5");
			driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[9]/div[3]/div/div")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[5]")).click();
			driver.findElement(By.name("father_name")).sendKeys("Test QA");
			driver.findElement(By.name("mother_name")).sendKeys("Test QA");
			driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[12]/label/span[1]/input")).click();
			driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
		} catch(Exception e){
			
		}

		
	}

}
