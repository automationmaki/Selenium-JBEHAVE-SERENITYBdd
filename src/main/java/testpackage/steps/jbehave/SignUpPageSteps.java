package testpackage.steps.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import testpackage.steps.serenity.SignUpSteps;

import java.util.Map;

public class SignUpPageSteps {
    @Steps
    SignUpSteps steps;

    @Given("I open sign up page")
    public void openPage(){
        steps.click_signup();
    }

    @When("I set date: $table")
    public void setDate(ExamplesTable table){
        Map<String, String> date = table.getRow(0);

        if (table.getHeaders().contains("month")){
            steps.set_month(date.get("month"));
        }
        steps.set_month(date.get("month"));
        steps.set_day(date.get("day"));
        steps.set_year(date.get("year"));
        table.getRows()
    }

    @When("I set month \"$month\"")
    public void setMonth(String month){
        steps.set_month(month);
    }

    @When("I set day \"$day\"")
    public void setDay(String day){
        steps.set_day(day);
    }

    @When("I set year \"$year\"")
    public void setYear(String year){
        steps.set_day(year);
    }

    @When("I check share")
    public void checkShare(){
        steps.set_share(true);
    }

    @When("I uncheck share")
    public void uncheckShare(){
        steps.set_share(false);
    }

    @When("I type email \"$email\"")
    public void typeEmail(String email){
        steps.type_email(email);
    }

    @When("I type confirmation email \"$email\"")
    public void typeConfirmationEmail(String email){
        steps.type_confirmation_email(email);
    }


    @When("I type name \"$name\"")
    public void typeName(String name){
        steps.type_name(name);
    }

    @When("I type password \"$password\"")
    public void typePassword(String password){
        steps.type_name(password);
    }


    @When("I click signup")
    public void clickSignUp(){
        steps.click_signup();
    }

    @When("I select sex \"$sex\"")
    public void selectSex(String sex){
        steps.select_sex(sex);
    }

    @Then("I see error \"$message\"")
    public void shouldSeeErrorByText(String text){
        steps.should_see_error(text);
    }

    @Then("I do not see error \"$message\"")
    public void shouldNotSeeErrorByText(String text){
        steps.should_not_see_error(text);
    }

    @Then("I see \"$number\" error")
    public void shouldSeeNumberOfErrors(int number){
        steps.should_see_errors_count(number);
    }

    @Then("I see that \"$number\" error \"When were you born\"")
    public void shouldSeeErrorBynumber(int number, String message){
        steps.should_see_error_by_number(number, message);
    }













}
