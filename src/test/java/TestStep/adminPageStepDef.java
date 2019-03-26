package TestStep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class adminPageStepDef {
	
//	WebDriver driver;
//	
//	
//	@Given("admin is already on Login page")
//	public void admin_is_already_on_Login_page() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//	}
//
//	@When("title of login page is Orange_HRM")
//	public void title_of_login_page_is_Orange_HRM() {
//		String  title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("OrangeHRM", title);
//	}
//
//	@Then("admin enters username and password")
//	public void admin_enters_username_and_password(io.cucumber.datatable.DataTable credentials) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//		String data1 = credentials.cell(0, 0);
//		String data2 = credentials.cell(0, 1);
//		System.out.println(data1+"|"+data2);
//		driver.findElement(By.id("txtUsername")).sendKeys(data1);
//		driver.findElement(By.id("txtPassword")).sendKeys(data2);
//		//below scripts is from github, which is not working:
////		List<List<String>> data = credentials.raw();
////		 driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
////		 driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//		
//	}
//
//	@Then("admin clicks on login button")
//	public void admin_clicks_on_login_button() {
//		driver.findElement(By.id("btnLogin")).click();
//	}
//
//	@Then("admin is on dashboard page")
//	public void admin_is_on_dashboard_page() {
//		String  title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("OrangeHRM", title);
//	}
//
//	@Then("admin moves to PIM page")
//	public void admin_moves_to_PIM_page() {
//		driver.findElement(By.id("menu_pim_viewPimModule")).click();
//	}
//
//	@Then("admin enters search details")
//	public void admin_enters_search_details(io.cucumber.datatable.DataTable dealData) {
//		String data1 = dealData.cell(0, 0);
//		String data2 = dealData.cell(0, 1);
//		String data3 = dealData.cell(0, 2);
//		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(data1);
//		driver.findElement(By.id("empsearch_id")).sendKeys(data2);
//		driver.findElement(By.id("empsearch_supervisor_name")).sendKeys(data3);
//
//
//	}
//
//	@Then("admin click search button")
//	public void admin_click_search_button() {
//		driver.findElement(By.id("searchBtn")).click();
//		System.out.println("search completed");
//	}
//
//	@Then("Close the browser")
//	public void close_the_browser() {
//		driver.close();
//		System.out.println("browser closed");
//	}


}
