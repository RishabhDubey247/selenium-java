package referloan;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fullerton {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions builder = new Actions(driver); 
		driver.manage().window().maximize();
		driver.get("https://qa.referloan.in");
		
		Thread.sleep(5000);
		System.out.println("About to zoom out");
		Robot robot = new Robot();
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(3000);
		
		WebElement loan = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/a"));
		WebElement PL = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[1]/a"));
		Actions act = new Actions(driver);
		
		builder.moveToElement(loan).perform();
		builder.moveToElement(PL).perform();
		driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[1]/div/ul/li[9]/a")).click();
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.name("full_name")).sendKeys("Shubham Agrawal");
		Thread.sleep(1000);
		driver.findElement(By.name("phone_no")).sendKeys("7210482353");
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
		
		//step one
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		driver.findElement(By.id("Customer_Name")).sendKeys("Shuabham agrawal");
		driver.findElement(By.id("pan_FirstName")).sendKeys("Shubham ");
		driver.findElement(By.id("pan_MiddleName")).sendKeys("agrawal");
		driver.findElement(By.id("pan_LastName")).sendKeys("agrawal");
		driver.findElement(By.id("Email")).sendKeys("shubaham@gmail.com");
		driver.findElement(By.name("l_PAN")).sendKeys("TESTS4567R");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"mui-component-select-l_Gender\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"mui-component-select-l_Qualification\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[8]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"mui-component-select-l_MaritalStatus\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
		Thread.sleep(700);
		
		WebElement dob = driver.findElement(By.id("l_DOB"));
		act.doubleClick(dob).perform();
		driver.findElement(By.id("l_DOB")).sendKeys("04-05-1971");
		driver.findElement(By.id("l_Gross_Monthly_Income")).sendKeys("45000");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"mui-component-select-purposeOfLoan\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[3]")).click();
		
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
		
		//step 2
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[5]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[3]")).click();
		driver.findElement(By.id("resident_address")).sendKeys("Noida sector-2");
		driver.findElement(By.id("l_Currentpincode")).sendKeys("201301");
		driver.findElement(By.id("resident_pincode")).sendKeys("201310");
		driver.findElement(By.id("noOfMonthsAtCurrentAddress")).sendKeys("20");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"mui-component-select-l_Permanentiscurrent\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[1]")).click();
		driver.findElement(By.id("l_Current_Landmark")).sendKeys("Near Metro Station");
		Thread.sleep(600);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
		
		//stp 3 
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[5]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[3]")).click();
		driver.findElement(By.name("CompanyName")).sendKeys("Referloan");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[1]/div[15]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("office_address")).sendKeys("sector 2 noida");
		driver.findElement(By.name("office_pincode")).sendKeys("201301");
		driver.findElement(By.name("l_Total_Work_Exp_Mnths")).sendKeys("24");
		driver.findElement(By.name("l_AIP_Tenure")).sendKeys("24");
		driver.findElement(By.name("l_Total_Work_Exp_Mnths")).sendKeys("24");
		driver.findElement(By.name("l_Loan_Amount_Applied")).sendKeys("340000");
		driver.findElement(By.name("finalTenureRequired")).sendKeys("48");
		driver.findElement(By.name("l_Alternate_Email")).sendKeys("shabham69@gmail.com");
		driver.findElement(By.name("l_Office_Landmark")).sendKeys("Near Metro");
		driver.findElement(By.name("l_IndustryType")).sendKeys("Ptb.");
		driver.findElement(By.xpath("/html/body/div/div/section[1]/div[2]/div/form/div/div[2]/button")).click();
		
		//step 4
//		Thread.sleep(2000);
//		WebElement chooseFile = driver.findElement(By.id("610"));
//		Thread.sleep(2000);
//		chooseFile.sendKeys("C:\\Users\\risha\\Downloads\\supercard.png\");
//		Thread.sleep(2000);
//		WebElement chooseFile1 = driver.findElement(By.id("611"));
//		Thread.sleep(2000);
//		chooseFile1.sendKeys("C:\\Users\\risha\\Downloads\\supercard.png\");
//		Thread.sleep(2000);
//		WebElement chooseFile2 = driver.findElement(By.id("23"));
//		Thread.sleep(2000);
//		chooseFile2.sendKeys("C:\\Users\\risha\\Downloads\\supercard.png\");
//		Thread.sleep(2000);
//		WebElement chooseFile3 = driver.findElement(By.id("195"));
//		Thread.sleep(2000);
//		chooseFile3.sendKeys("C:\\Users\\risha\\Downloads\\supercard.png\");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("")).click();
		


	}

}
