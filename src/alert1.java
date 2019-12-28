//This Test scripts shows the execution of the Alert Settings with valid details




import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

//functionalities according to testcase

@Test
public class alert1
{
	WebDriver driver;
	
	
	
    @Test
	public void alert() 
  {
	  
	 driver.findElement( By.id("cyclosUsername")).sendKeys("admin");
	driver.findElement(By.id("cyclosPassword")).sendKeys("1234");
	
	driver.findElement(By.xpath("//input[@value='1']")).click();
	driver.findElement(By.xpath("//input[@value='2']")).click();
	driver.findElement(By.xpath("//input[@value='3']")).click();
	driver.findElement(By.xpath("//input[@value='4']")).click();
	
	 driver.findElement(By.xpath("//input[@value='Submit']")).click();
	 
	 driver.findElement(By.xpath("//span[contains(text(),'Sett')]")).click();
	 driver.findElement(By.xpath("//span[contains(text(),'Alert Settings')]")).click();
	 
	 driver.findElement(By.id("modifyButton")).click();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	 driver.findElement(By.name("setting(givenVeryBadRefs)")).clear();
	 driver.findElement(By.name("setting(givenVeryBadRefs)")).sendKeys("2");
	 
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	 driver.findElement(By.name("setting(receivedVeryBadRefs)")).clear();
	 driver.findElement(By.name("setting(receivedVeryBadRefs)")).sendKeys("1");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 driver.findElement(By.name("setting(idleInvoiceExpiration).number")).clear();
	 driver.findElement(By.name("setting(idleInvoiceExpiration).number")).sendKeys("6");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 driver.findElement(By.name("setting(amountDeniedInvoices)")).clear();
	 driver.findElement(By.name("setting(amountDeniedInvoices)")).sendKeys("4");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 driver.findElement(By.name("setting(amountIncorrectLogin)")).clear();
	 driver.findElement(By.name("setting(amountIncorrectLogin)")).sendKeys("5");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 driver.findElement(By.id("saveButton")).click();
	 
	 //assertion code
	 
	 String expresult = "Alert settings modified";
	 Alert alert = driver.switchTo().alert();
	 String actresult = alert.getText();
	 System.out.println(actresult);
	 Assert.assertTrue(actresult.contains(expresult));
	 alert.accept();
	 
	 		
	 
	 	  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() 
  {
	  driver = new ChromeDriver();
	  driver.get("http://localhost:8585/");
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() 
  {
	 
  }

  @AfterTest
  public void afterTest() {
  }


}
