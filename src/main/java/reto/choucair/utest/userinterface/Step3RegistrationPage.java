package reto.choucair.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Step3RegistrationPage {

    public static final Target COMPUTER  = Target.the("where do we select computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target SLC_COMPUTER = Target.the("where do we select Computer")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-3-3\"]/span/div"));
    public static final Target CLICK_SLC_COMPUTER = Target.the("Select the pc")
            .located(By.xpath("//*[@id=\"ui-select-choices-row-17-0\"]/span/div/span"));
    public static final Target VERSION  = Target.the("where do we select the version computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target MOVIL = Target.the("where do we select celphone")
            .located(By.cssSelector("#ui-select-choices-row-12-4 > span > div"));
    public static final Target BTN_LAST_STEP = Target.the("where do we go the 4° step")
            .located(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > div:nth-child(2) > div > a > span"));


}
