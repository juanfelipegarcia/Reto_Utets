package reto.choucair.utest.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import reto.choucair.utest.model.RetoChoucairUtestData;
import reto.choucair.utest.tasks.*;

import java.util.List;


public class RetoChoucairStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast());}

    @Given("^than Felipe wants to register on the Utest website$")
    public void thanFelipeWantsToRegisterOnTheUtestWebsite(){
        OnStage.theActorCalled("Felipe").wasAbleTo(OpenUp.thePage());

    }

    @When("^he finds the website registration form$")
    public void heFindsTheWebsiteRegistrationForm() {
        OnStage.theActorCalled("Felipe").wasAbleTo(JoinToday.onThePage());
    }

    @Then("^he registers on the UTest website$")
    public void heRegistersOnTheUTestWebsite(List<RetoChoucairUtestData> retoChoucairUtestData) throws Exception{
        OnStage.theActorCalled("Felipe")
                .wasAbleTo(
                        Step1Registration.onThePage(retoChoucairUtestData.get(0).getStrName(),
                                retoChoucairUtestData.get(0).getStrLastName(),
                                retoChoucairUtestData.get(0).getStrEmail(),
                                retoChoucairUtestData.get(0).getStrMonth(),
                                retoChoucairUtestData.get(0).getStrDay(),
                                retoChoucairUtestData.get(0).getStrYear(),
                                retoChoucairUtestData.get(0).getStrLanguages()),
                        Step2Registration.onThePage(retoChoucairUtestData.get(0).getStrCity(),
                                retoChoucairUtestData.get(0).getStrZipCode(),
                                retoChoucairUtestData.get(0).getStrContry()),
                        Step3Registration.onThePage(),
                        Step4Registration.onThePage(retoChoucairUtestData.get(0).getStrCreatePassword(), retoChoucairUtestData.get(0).getStrConfirmPassword())
        );

    }


}
