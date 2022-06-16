package Parallel;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pages.searchResults;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchresults {
	
	private WebDriver driver;
	private String title;
	private String msg;
	searchResults objsearchResults = new searchResults(DriverFactory.getDriver());

	@Given("The user is on My Patients page with search results")
	public void the_user_is_on_my_patients_page_with_search_results() {
		//it calls Application hooks to invoke browser
	}

	@When("User clicks CREATE NEW REPORT\\/PLAN link of respective patient")
	public void user_clicks_create_new_report_plan_link_of_respective_patient() {
		objsearchResults.clickCreateNewPlan();
	}

	@Then("The user should  be sent to that patients Confirm health condition and build plan page")
	public void the_user_should_be_sent_to_that_patients_confirm_health_condition_and_build_plan_page() {
		title = driver.getTitle();
		Assert.assertTrue(title.contains("expectedTitleName"));
	}

	@When("User clicks VIEW PREVIOUS TEST REPORTS link of respective patient")
	public void user_clicks_view_previous_test_reports_link_of_respective_patient() {
		objsearchResults.clickTestReports();
	}

	@Then("The user should  be navigated to that patients View Recent Test Reports page")
	public void the_user_should_be_navigated_to_that_patients_view_recent_test_reports_page() {
		title = driver.getTitle();
		Assert.assertTrue(title.contains("expectedTitleName"));
	}

	@When("User clicks VIEW PREVIOUS DIET PLANS link of respective patient")
	public void user_clicks_view_previous_diet_plans_link_of_respective_patient() {

		objsearchResults.clickPreviousDietPlan();
	}

	@Then("The user should  be navigated to that patients View Recent Diets page")
	public void the_user_should_be_navigated_to_that_patients_view_recent_diets_page() {
		title = driver.getTitle();
		Assert.assertTrue(title.contains("expectedTitleName"));
	}

	@When("User clicks page number")
	public void user_clicks_page_number() {
		objsearchResults.clickPageNumber();
	}

	@Then("The user must navigate to respective page")
	public void the_user_must_navigate_to_respective_page() {
		objsearchResults.pageNumber();
		msg="pageNumber string";
		Assert.assertTrue(msg.contains("pageNumber string"));
	}

	@When("User clicks next arrow")
	public void user_clicks_next_arrow() {
		objsearchResults.clickFrontArrow();
	}

	@Then("The user must navigate to next page")
	public void the_user_must_navigate_to_next_page() {
		objsearchResults.pageNumber();
		msg="pageNumber string";
		Assert.assertTrue(msg.contains("pageNumber string"));
	}
	
	@When("User clicks back arrow")
	public void user_clicks_back_arrow() {
		objsearchResults.clickBackArrow();
	}

	@Then("The user must navigate to previous page")
	public void the_user_must_navigate_to_previous_page() {
		objsearchResults.pageNumber();
		msg="pageNumber string";
		Assert.assertTrue(msg.contains("pageNumber string"));
	}

	@Given("The user is on View Recent Test Reports Page")
	public void the_user_is_on_view_recent_test_reports_page() {
	   System.out.println("page title is Test reports");
	}

	@When("User Clicks View PDF Button")
	public void user_clicks_view_pdf_button() {
		objsearchResults.clickPDF();
	}

	@Then("The user must able to view the file with patient informations")
	public void the_user_must_able_to_view_the_file_with_patient_informations(){
		objsearchResults.capturePDFinfo();
	}
}
