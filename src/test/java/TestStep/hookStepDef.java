package TestStep;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class hookStepDef {
	
	// below two Hooks(@Before & @After) are global Hooks
	@Before(order=0)
	public void setUP(){
		System.out.println("launch FF");
		System.out.println("Enter URL for Free CRM APP");
	}
	
	@After(order=0)
	public void tearDown(){
		System.out.println("close the browser");
	}
	
	@Before(order=1)
	public void setUP1(){
		System.out.println("launch FF");
		System.out.println("Enter URL for Free CRM APP");
	}
	
	@After(order=1)
	public void tearDown1(){
		System.out.println("close the browser");
	}
	
	// below are local Hooks only for first scenario:
	@Before("@First")
	public void beforeFirst(){
		System.out.println("before only first scenario");
	}
	
	@After("@First")
	public void afterFirst(){
		System.out.println("after only first sceanrio");
	}
	
	@Before("@Second")
	public void beforeSecond(){
		System.out.println("before only second scenario");
	}
	
	@After("@Second")
	public void afterSecond(){
		System.out.println("after only second sceanrio");
	}
	
	@Before("@Third")
	public void beforeThird(){
		System.out.println("before only third scenario");
	}
	
	@After("@Third")
	public void afterThird(){
		System.out.println("after only third sceanrio");
	}
	
	@Given("user is on deal page")
	public void user_is_on_deal_page() {
		System.out.println("user is on deal page");
	}

	@When("user fills the deals form")
	public void user_fills_the_deals_form() {
		System.out.println("create a deal");
	}

	@Then("deal is created")
	public void deal_is_created() {
		System.out.println("deal is created");
	}


}
