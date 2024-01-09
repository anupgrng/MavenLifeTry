package ITSutra.MavenLifeTry;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LearnGoals {
	
WebDriver driver;
	
  @Test
public void LoginTest() {
	  
	  driver.findElement(By.id("UserName")).sendKeys("admin");
	  driver.findElement(By.id("Password")).sendKeys("password");
	  
	  Actions actions = new Actions(driver);
	  actions.click(driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[4]/div/input"))).build().perform();
	  
	  List<WebElement> ifLogin = driver.findElements(By.xpath("//*[@id=\"logoutForm\"]/ul/li[2]/a"));
	   
	  assertNotNull(ifLogin);
	  assertNotEquals(0, ifLogin.size());
	  
	 
	  
	  
  }
  
	  @Test
	public void RegisterUserTest() {
		  
		  
		  driver.findElement(By.id("UserName")).sendKeys("ABCxyz");
		  
		  driver.findElement(By.id("Password")).sendKeys("123ABCXyz@");
		  
		  driver.findElement(By.id("ConfirmPassword")).sendKeys("123ABCXyz@");
		  
		  driver.findElement(By.id("Email")).sendKeys("ABCxyz4321@gmail.com");
		  
		  Actions actions = new Actions(driver);
		  
		  actions.click(driver.findElement(By.xpath("/html/body/div[2]/form/div[6]/div/input"))).build().perform();
		  
		  
		  
		  List<WebElement> ifLogin = driver.findElements(By.xpath("//*[@id=\"logoutForm\"]/ul/li[2]/a"));
		   
		  assertNotNull(ifLogin);
		  assertNotEquals(0, ifLogin.size());
		
		  	  
		  
		  
		  
	  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new FirefoxDriver();
	  driver.get("http://eaapp.somee.com/Account/Register");
	  driver.manage().window().maximize();
	 
	  
	  driver = new FirefoxDriver();
	  driver.get("http://eaapp.somee.com/Account/Login");
	  driver.manage().window().maximize();
	  
	 
	  
  }

  @AfterTest
  public void afterTest() {
	 driver.quit();
	  
  }

}
