package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepDefinitions {

	//Steps for addition 
	
    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable {
    	 //Let's user know they are about to use Add integers
    	System.out.println("Let's Use a Calculator for Addition");
    }

    @When("^User adds two integers and selects equal$")
    public void user_adds_two_integers_and_selects_equal() throws Throwable {
    	//Code to call Addition Class
    	addClass addInts = new addClass(); // declaring the object
    	addInts.main(new String[]{"addSum"});// calling the method. {
    	}

    @Then("^Total displays$")
    public void total_displays() throws Throwable {
    }

    // Steps for subtraction
  
    
    
    @Given("^User has a calculator $")
    public void user_has_a_calculator() throws Throwable {
    	 //Let's user know they are about to subtract integers 
    	System.out.println("Let's Use a Calculator for Subtraction");
    	subtractClass subtractInts = new subtractClass(); // declaring the object
    	subtractInts.main(new String[]{"subtractSum"});// calling the method. {
    	}


    @When("^User subtracts two integers and selects Enter$")
    public void user_subtracts_two_integers_and_selects_enter() throws Throwable {
    	//Code to call Subtraction Class
    }


    @Then("^Sum displays$")
    public void sum_displays() throws Throwable {
    }

    //Steps for multiplication 
    
    @Given("^User is using a calculator $")
    public void user_is_using_a_calculator() throws Throwable {
    	 //Let's user know they are about to multiply integers
    	System.out.println("Let's Use a Calculator for Multiplication");
    }

    @When("^User multiplies two integers and selects Enter$")
    public void user_multiplies_two_integers_and_selects_enter() throws Throwable {
    	//Code to call Multiplication Class
    	multiplyClass multiplyInts = new multiplyClass(); // declaring the object
    	multiplyInts.main(new String[]{"multiplySum"});// calling the method. {
    	}


    @Then("^Total displays for user$")
    public void total_displays_for_user() throws Throwable {
    }
    
    // Steps for division 
    
    @Given("^User is operating calculator $")
    public void user_is_operating_calculator() throws Throwable {
        //Let's user know they are about to divide integers
    	System.out.println("Let's Use a Calculator for Division");
    }

    @When("^User adds two integers and selects Enter$")
    public void user_adds_two_integers_and_selects_enter() throws Throwable {
    	//Code to call Division Class
    	divideClass divideInts = new divideClass(); // declaring the object
    	divideInts.main(new String[]{"divideSum"});// calling the method. {
    	}


    @Then("^Sum displays for user$")
    public void sum_displays_for_user() throws Throwable {
    }

    
    

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    