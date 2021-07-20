 package StepDefinitions;


import com.BASE.BasePage;
import com.PAGES.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BasePage {

    @Given("user launch the url")
    public void user_launch_the_url() {

        InstanceOf(LoginPage.class).goToUrl();




    }

    @When("user clicks on signin button")
    public void user_clicks_on_signin_button() {
        InstanceOf(LoginPage.class).clickSigninbttn1();


    }

    @And("user enter username {string}")
    public void user_enter_username(String string) {
        InstanceOf(LoginPage.class).enterUserName();
    }

    @And("user enter password {string}")
    public void user_enter_password(String string) {
        InstanceOf(LoginPage.class).enterPassword();

    }

    @When("user clicks on signin button1")
    public void user_clicks_on_signin_button1() {
        InstanceOf(LoginPage.class).clickSigninbttn1();


    }
    @Then("user  is on login page")
    public void user_is_on_login_page() {


    }

}
