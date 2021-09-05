package reto.choucair.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnElement;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import reto.choucair.utest.userinterface.Step3RegistrationPage;

public class Step3Registration implements Task {

    public static Step3Registration onThePage() {
        return Tasks.instrumented(Step3Registration.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                /*
                Click.on(Step3RegistrationPage.COMPUTER),
                Enter.theValue("macOS").into(Step3RegistrationPage.SLC_COMPUTER),
                Click.on(Step3RegistrationPage.CLICK_SLC_COMPUTER),
                Click.on(Step3RegistrationPage.VERSION),
                */
                Click.on(Step3RegistrationPage.BTN_LAST_STEP)
                );
    }
}
