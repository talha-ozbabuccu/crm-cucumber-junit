package com.crm.step_definitions;

import io.cucumber.java.Before;

/*In the class we will be able to pass pre & post conditions to
each scenario and each step*/
public class Hooks {
    //import from io.cucumber.java not from junit
    @Before
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }

}
