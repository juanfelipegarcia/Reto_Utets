package reto.choucair.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Step2RegistrationPage {

    public static final Target CITY = Target.the("where do we write the City")
            .located(By.id("city"));
    public static final Target SLC_CITY = Target.the("where do we go the second step")
           // .located(By.xpath("col-xs-12 col-sm-12 col-md-6 col-lg-6 location"));
            .located(By.xpath("//span[@class='pac-matched']//preceding::*[contains(text(), 'Antioquia, Colombia')]"));
                  // .located(By.xpath("xpath=//section[@id='regs_container']/div"));
    public static final Target ZIP_POSTAL_CODE = Target.the("where do we write the zip postal code")
            .located(By.id("zip"));
    public static final Target COUNTRY  = Target.the("where do we write the CONTRY name")
            .located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div.form-group-box > div.row > div.col-xs-12.col-sm-12.col-md-6.col-lg-6.location > div:nth-child(4) > div.ui-select > div > div > div.ui-select-match > span > span.ui-select-match-text.pull-left"));
    public static final Target SELECT_COUNTRY  = Target.the("where do we write the CONTRY name")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
        public static final Target BTN_DEVICES = Target.the("where do we go the 3° step")
            .located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div:nth-child(2) > div > a > span"));


}
