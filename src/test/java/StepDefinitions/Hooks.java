package StepDefinitions;

import Utilities.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {

    @After
    public  void after(Scenario scenario){
        BaseDriver.quitDriver();
    }
}
