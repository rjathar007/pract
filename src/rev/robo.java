package rev;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robo 
{
	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\Pract\\Soft\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Robot rob=new Robot();
		
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		Thread.sleep(2000);
		
		String url=driver.getCurrentUrl();
		
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).click();
		Thread.sleep(2000);
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V); 
		
		rob.keyRelease(KeyEvent.VK_V); 
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		
		rob.keyRelease(KeyEvent.VK_ENTER);
				
		System.out.println("Successfully Entered");
		
		System.out.println("Uploaded on github successfully");
		
	}
}