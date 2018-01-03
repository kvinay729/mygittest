package mavenPackage.mavenProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.URL;
import com.sun.jna.platform.win32.Netapi32Util.User;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
 
public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void openMyBlog() {
	driver.get("http://www.google.com/");
  }
  
	 @BeforeClass
	 public void beforeClass() {
		 
//		 URL url = classLoader.getResource("chromedriver.exe");
	
	 System.setProperty("webdriver.chrome.driver",
	 "C:\\Users\\zopper\\eclipse-workspace\\mavenProject\\chromedriver.exe");
	 driver = new ChromeDriver();
	 
	 
	 }
	
	 @AfterClass
	 public void afterClass() {
	 driver.quit();
	 }
 
}
