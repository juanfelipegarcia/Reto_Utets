package reto.choucair.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnElement;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromBy;
import net.serenitybdd.screenplay.questions.SelectOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import reto.choucair.utest.userinterface.Step1RegistrationPage;

public class Step1Registration implements Task {

    private String strName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strLanguages;


    public Step1Registration(String strName, String strLastName,  String strEmail,String strMonth,String strDay, String strYear, String strLanguages) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strLanguages = strLanguages;
    }

    public static Step1Registration onThePage(String strName, String strLastName,  String strEmail,String strMonth,String strDay, String strYear, String strLanguages) {
        return Tasks.instrumented(Step1Registration.class,strName, strLastName, strEmail, strMonth,strDay,strYear,strLanguages);
    }


@Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(strName).into(Step1RegistrationPage.FIRST_NAME),
                Enter.theValue(strLastName).into(Step1RegistrationPage.LAST_NAME),
                Enter.theValue(strEmail).into(Step1RegistrationPage.EMAIL),
                Click.on(Step1RegistrationPage.DATE_MONTH),
                SelectFromOptions.byValue(strMonth).from(Step1RegistrationPage.DATE_MONTH),
                Click.on(Step1RegistrationPage.DATE_DAY),
                SelectFromOptions.byValue(strDay).from(Step1RegistrationPage.DATE_DAY),
                Click.on(Step1RegistrationPage.DATE_YEAR),
                SelectFromOptions.byValue(strYear).from(Step1RegistrationPage.DATE_YEAR),
                Click.on(Step1RegistrationPage.LANGUAGES),
                Enter.theValue(strLanguages).into(Step1RegistrationPage.LANGUAGES),
                Click.on(Step1RegistrationPage.SLC_LENGUAGES),
                Click.on(Step1RegistrationPage.BTN_LOCATION)
        );
    }
}
