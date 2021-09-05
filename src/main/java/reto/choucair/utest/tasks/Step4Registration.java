package reto.choucair.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import reto.choucair.utest.userinterface.Step4RegistrationPage;

public class Step4Registration implements Task {

    private String strCreatePassword;
    private String strConfirmPassword;

    public Step4Registration(String strCreatePassword,String strConfirmPassword ){
        this.strCreatePassword = strCreatePassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static Step4Registration onThePage(String strCreatePassword,String strConfirmPassword) {

        return Tasks.instrumented(Step4Registration.class, strCreatePassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(strCreatePassword).into(Step4RegistrationPage.CREATE_PASSWORD),
                Click.on(Step4RegistrationPage.COMFIRM_PASSWORD),
                Enter.theValue(strConfirmPassword).into(Step4RegistrationPage.COMFIRM_PASSWORD),
                Click.on(Step4RegistrationPage.STAY_INFORMED),
                Click.on(Step4RegistrationPage.ACCEPT_TERMS),
                Click.on(Step4RegistrationPage.ACCEPT_PRIVACY),
                Click.on(Step4RegistrationPage.BTN_COMPLETE_SETUP)
        );

    }

}
