package reto.choucair.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reto.choucair.utest.userinterface.JoinTodayPage;

public class JoinToday implements Task {


    public static JoinToday onThePage() {
        return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(JoinTodayPage.JOIN_BUTTON)
        );
    }
}
