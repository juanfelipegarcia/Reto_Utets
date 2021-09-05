package reto.choucair.utest.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinTodayPage {
    public static final Target JOIN_BUTTON = Target.the("button for to do registration page")
            .located(By.xpath("//a[@href='/signup/personal']"));
}
