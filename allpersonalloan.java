package referloan;

import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class allpersonalloan {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
//		WebDriver driver = new ChromeDriver(options);
		Actions builder = new Actions(driver); 
		driver.manage().window().maximize();
		driver.get("https://qa.referloan.in");
		Thread.sleep(5000);
		
		WebElement loan = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/a"));
		WebElement PL = driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[1]/a"));
		Actions act = new Actions(driver);
		
		
		builder.moveToElement(loan).perform();
		builder.moveToElement(PL).perform();
		driver.findElement(By.xpath("/html/body/div/header[2]/nav/div/ul/li[2]/div/ul/li[1]/div/ul/li[11]/a")).click();
		
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
		
//		otp click
		final JDialog dialog = new JDialog();
	    dialog.setAlwaysOnTop(true);
	    String otp = JOptionPane.showInputDialog(dialog, "Please enter your otp", "Enter product name", JOptionPane.INFORMATION_MESSAGE);
	    driver.findElement(By.name("otp")).sendKeys(""+otp+"");
		driver.findElement(By.xpath("//button[@class= 'mt-4' and contains(.,'verify OTP')]")).click();
		Thread.sleep(3000);
		
		String Name = "Test QA";
		String mobile = "9717156422";
		String pan = "TEASTQ5674Q";
		String State = "UP";
		String Address = "Area ABC Sector-2";
		String City = "Noida";
		String Email = "tester123@gmail.com";
		
		for (int i=1; i<=10; i++) {
		String test1 = driver.findElement(By.xpath("(//*[contains(@class,'MuiFormControl-root')])[("+i+")]")).getText();
		String newtest2 = (test1.toLowerCase());
		WebElement test2 = driver.findElement(By.xpath("(//*[contains(@class,'MuiFormControl-root')])["+i+"]"));
	
			if(newtest2.contains("pan")){
				System.out.print("true");
				test2.click();
				Thread.sleep(1000);
				builder.sendKeys(""+pan+"").perform();
			}
			else if(newtest2.contains("name")){
				test2.click();
				Thread.sleep(1000);
				builder.sendKeys(""+Name+"").perform();
			}
			else if(newtest2.contains("Number")){
				test2.click();
				Thread.sleep(1000);
				builder.sendKeys(""+mobile+"").perform();
			}
			else if(newtest2.contains("email")){
				test2.click();
				Thread.sleep(1000);
				builder.sendKeys(""+Email+"").perform();
				
			}
			else if(newtest2.contains("city")){
				test2.click();
				Thread.sleep(1000);
				builder.sendKeys(""+City+"").perform();
			}
			else if(newtest2.contains("state")){
				test2.click();
				Thread.sleep(1000);
				builder.sendKeys(""+State+"").perform();
			}
			else if(newtest2.contains("date")){
				test2.click();
				Thread.sleep(1000);
				act.doubleClick(test2).perform();
				builder.sendKeys("04-05-1971").perform();
			}
			else if(newtest2.contains("gender")){
				test2.click();
				Thread.sleep(1000);
				WebElement find_element = driver.findElement(By.xpath("(//*[contains(@class,'MuiFormControl-root')])"));
				WebElement find_element_text = driver.findElement(By.xpath("(//*[contains(@class,'MuiFormControl-root')])"));
				String test_element = find_element.getTagName();
				String test_element2 = find_element_text.getTagName();
				System.out.print(test_element);
				System.out.print(test_element2);
			}
		}
	
		}
	}


