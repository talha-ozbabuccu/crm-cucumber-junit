package com.crm.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("User enters student username");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("User enters student password");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("User enters admin username");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("User enters admin password");
    }
}

