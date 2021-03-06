package cucu;



import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStepstest {
	//dep injection singlton object
	public CheckoutStepstest(fruit fc) {
		this.fc = fc;
	}

	private int am;
	private fruit fc;
	@Given("I should have {int} NIS")
	public void i_should_have_nis(Integer amountofmoney) {
	  am=amountofmoney; 
	}

	@When("I checkout for buying an one apple")
	public void i_checkout_for_buying_an_one_apple() {
	  fc. checkout();
	  am=49;
	}

	@Then("The amount of many should be {int}")
	public void the_amount_of_many_should_be(Integer remaining) {
	   assertTrue(am==remaining);
	   fc.checkout();
	}

	@Then("Error should be appeared")
	public void error_should_be_appeared() {
		assertTrue(0==1);
	}
}
