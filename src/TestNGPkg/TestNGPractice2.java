package TestNGPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice2 {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\msramesh\\eclipse-workspace\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void openURL() {
    driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
	}	
	
	@Test(priority=2,dependsOnMethods= {"openURL"})
	public void keyInFirstName() {
	driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Ramesh");
	}
	
	
	@Test(priority=3,dependsOnMethods= {"keyInFirstName"})
	public void keyInLastName() {
	driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("Shanmguam");
	}
	
	@Test(priority=4,dependsOnMethods= {"keyInLastName"})
	public void keyInEmail() {
	driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("Ramesh31@gmail.com");
	}
	
	@Test(priority=5,dependsOnMethods= {"keyInEmail"})
	public void keyInPhno() {
	driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("0112828282");
	}
	
	@Test(priority=6,dependsOnMethods= {"keyInPhno"})
	public void keyInPwd() {
	driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("ramesh");
	}
	
	@Test(priority=7,dependsOnMethods= {"keyInPwd"})
	public void keyInConfirmPwd() {
	driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("ramesh");
	}	
	
	@Test(priority=8,dependsOnMethods= {"keyInConfirmPwd"})
	public void policy() {
	driver.findElement(By.xpath("//input[@name='agree']")).click();
	}	
	
	@Test(priority=9,dependsOnMethods= {"policy"})
	public void submit() {
	driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	System.out.println("done1");
	}
	
	//@AfterMethod
	public void closedriver() {
		driver.close();
	}
	
}
