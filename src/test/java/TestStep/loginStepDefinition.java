package TestStep;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class loginStepDefinition {
	
	WebDriver driver;
	
	
	@Given("^User is already on Login page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");	
		
	}
	
	@When("^title of login page is OrangeHRM$")
	public void title_of_login_is_OrangeHRM() {
		
		String  title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("OrangeHRM", title);
		
	}
	
	@Then("^user enters \\'(.*)\\' and \\'(.*)\\'$")
	public void user_enters_username_password(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
		// below is a Selenium function: in case the button not clicked
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", loginBtn);
	}
	
	@Then("^user is on the home page$")
	public void user_is_on_the_home_page() {
		String  title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("OrangeHRM", title);
	}
	
	@Then("^browser closed$")
	public void browser_closed() {
		driver.close();
		System.out.println("browser closed");
	}
	
	
	
	

}
