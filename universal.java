package referloan;
import java.util.Arrays;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class universal {
	

	public static void main(String[] args) throws InterruptedException {
		
		// driver set up
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://qa.referloan.in");
    	  final JDialog dialog = new JDialog();
	    dialog.setAlwaysOnTop(true);
	    String prodname = JOptionPane.showInputDialog(dialog, "Please enter your Product name", "Enter product name", JOptionPane.INFORMATION_MESSAGE);
	    

		String pname = ""+prodname+"";
		
		String[] newline = pname.split(" ");
		
		//System.out.print(Arrays.toString(newline));
		String updated = "";
		for (int i=0; i<=2; i++) {
			//System.out.print(newline[i]);
			 String update = newline[i];
			updated = update.substring(0, 1).toUpperCase()+ update.substring(1).toLowerCase()+" ";
		}
		
		
		
		System.out.print(updated);
	    
		Thread.sleep(5000);
		    
		WebElement findprod = driver.findElement(By.xpath("//a[@tabindex='-1' and contains(text(),'"+updated+"')]"));
		    
		 String form_link = findprod.getAttribute("href");
		 driver.get(form_link);
		 Thread.sleep(2000);
		 System.out.print(form_link);
		 
		 
		 
		    driver.quit();
	}

}
