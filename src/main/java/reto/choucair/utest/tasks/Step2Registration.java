package reto.choucair.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromBy;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromElement;
import net.serenitybdd.screenplay.questions.SelectedValue;
import net.serenitybdd.screenplay.rest.interactions.Ensure;
import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.interactions.touch.Move;
import reto.choucair.utest.userinterface.Step2RegistrationPage;


public class Step2Registration implements Task {

    private String strCity;
    private String strZipCode;
    private String strCountry;

    public Step2Registration(String strCity,String strZipCode,String strContry){
        this.strCity = strCity;
        this.strZipCode = strZipCode;
        this.strCountry = strContry;
    }

    public static Step2Registration onThePage(String strCity,String strZipCode, String strContry) {

        return Tasks.instrumented(Step2Registration.class, strCity, strZipCode, strContry);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(Step2RegistrationPage.CITY),
                Clear.field(Step2RegistrationPage.CITY),
                Enter.theValue(strCity).into(Step2RegistrationPage.CITY)
        );
        actor.attemptsTo(Click.on(Step2RegistrationPage.SLC_CITY),
                Click.on(Step2RegistrationPage.ZIP_POSTAL_CODE),
                Clear.field(Step2RegistrationPage.ZIP_POSTAL_CODE),
                Enter.theValue(strZipCode).into(Step2RegistrationPage.ZIP_POSTAL_CODE),
                Click.on(Step2RegistrationPage.COUNTRY),
                Enter.theValue(strCountry).into(Step2RegistrationPage.SELECT_COUNTRY)
        );

        actor.attemptsTo(Click.on(Step2RegistrationPage.BTN_DEVICES)
        );

    }
}
