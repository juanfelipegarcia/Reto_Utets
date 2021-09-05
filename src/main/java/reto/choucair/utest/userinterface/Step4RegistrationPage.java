package reto.choucair.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Step4RegistrationPage {

    public static final Target CREATE_PASSWORD  = Target.the("where do we create to password")
            .located(By.id("password"));
    public static final Target COMFIRM_PASSWORD = Target.the("where do we  confirm to password")
            .located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED = Target.the("where do we  click in STAY INFORMED")
            .located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div:nth-child(4) > label > span"));
    public static final Target ACCEPT_TERMS = Target.the("where do we  click in accept terms")
            .located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div:nth-child(5) > label > span.checkmark.signup-consent__checkbox.error"));
    public static final Target ACCEPT_PRIVACY = Target.the("where do we  accept privacy")
            .located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div:nth-child(6) > label > span.checkmark.signup-consent__checkbox.error"));


    public static final Target BTN_COMPLETE_SETUP = Target.the("where do we go Commplete the register")
            .located(By.cssSelector("#laddaBtn > span"));

}
