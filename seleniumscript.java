package referloan;
import org.openqa.selenium.chrome.ChromeDriver;
import referloan.icici_personal_loan_basic_form;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class seleniumscript {

	public static void main(String[] args) throws InterruptedException {
	
		
			System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver_win32_2\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				driver.get("https://qa.referloan.in");
				for(int i=0; i<=2; i++) {
					
//					test case = 1 (pancard no < 6 digit , salary = text)
					
					if(i==0) {
						try {
							System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver_win32_2\\chromedriver.exe");
							
						driver.manage().window().maximize();
								driver.get("https://qa.referloan.in");
								Select dropdown = new Select(driver.findElement(By.name("product_id")));
								dropdown.selectByVisibleText("Personal Loan");
								Thread.sleep(1000);
								driver.findElement(By.id("salary")).sendKeys("gfuyery");
								Thread.sleep(1000);
								CharSequence pincode = "32312";
								driver.findElement(By.id("pincode")).sendKeys(pincode);
								Thread.sleep(1000);
								driver.findElement(By.className("search-button")).click();
				     			Thread.sleep(1500);
							}
							catch(Exception e) {
							  System.out.println("please enter a number");
							  System.out.println("Pincode should be 6 digit");
							}
						
//						test case = 1 (pancard no > 6 digit , salary = number)
						
					}else if (i==1) {
						try {
							System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver_win32_2\\chromedriver.exe");
							
						driver.manage().window().maximize();
								driver.get("https://qa.referloan.in");
								Select dropdown = new Select(driver.findElement(By.name("product_id")));
								dropdown.selectByVisibleText("Personal Loan");
								Thread.sleep(1000);
								driver.findElement(By.id("salary")).sendKeys("12000");
								Thread.sleep(1000);
								CharSequence pincode = "3231232323";
								driver.findElement(By.id("pincode")).sendKeys(pincode);
								Thread.sleep(1000);
								driver.findElement(By.className("search-button")).click();
				     			Thread.sleep(1500);
							}
							catch(Exception e) {
							  System.out.println("something went wrong");
							}
						
//						test case = 1 (pancard no = 6 digit , salary = number)
						
					}else if (i==2) {
						try {
							System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver_win32_2\\chromedriver.exe");
							
						driver.manage().window().maximize();
								driver.get("https://qa.referloan.in");
								Select dropdown = new Select(driver.findElement(By.name("product_id")));
								dropdown.selectByVisibleText("Personal Loan");
								Thread.sleep(1000);
								driver.findElement(By.id("salary")).sendKeys("10000");
								Thread.sleep(1000);
								CharSequence pincode = "202012";
								driver.findElement(By.id("pincode")).sendKeys(pincode);
								Thread.sleep(1000);
								driver.findElement(By.className("search-button")).click();
				     			Thread.sleep(1500);
				     			
							}
							catch(Exception e) {
							  System.out.println("something went wrong");
							}
						
					}
				}
				driver.findElement(By.xpath("//a[@class= 'grabDeal' and contains(@href,'icici')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("full_name")).sendKeys("Test qa");
				Thread.sleep(1000);
				driver.findElement(By.name("phone_no")).sendKeys("9717156422");
				Thread.sleep(1000);
				driver.findElement(By.id("otpCheckbox")).click();
				Thread.sleep(1000);
				driver.findElement(By.className("mt-4")).click();
				Thread.sleep(10000);
				driver.findElement(By.className("mt-4")).click();
				Thread.sleep(1000);
				driver.quit();
	}

}
