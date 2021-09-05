package reto.choucair.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Step1RegistrationPage {
    public static final Target FIRST_NAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target DATE_MONTH  = Target.the("where do we write the birthMonth")
            .located(By.id("birthMonth"));
    public static final Target DATE_DAY = Target.the("where do we write the birthDay")
            .located(By.id("birthDay"));
    public static final Target DATE_YEAR = Target.the("where do we write the birthYear")
            .located(By.id("birthYear"));
    public static final Target LANGUAGES = Target.the("where do we write the languages")
            .located(By.cssSelector("#languages > div:nth-child(1) > input"));
    public static final Target SLC_LENGUAGES = Target.the("where do we go the second step")
            .located(By.cssSelector("#ui-select-choices-row-0-0 > span > div"));
    public static final Target BTN_LOCATION = Target.the("where do we go the second step")
            .located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div.form-group.col-xs-12.text-right > a > span"));
}
