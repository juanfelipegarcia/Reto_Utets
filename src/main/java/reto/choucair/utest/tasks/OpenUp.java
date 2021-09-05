package reto.choucair.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import reto.choucair.utest.userinterface.RetoChoucairPage;

public class OpenUp implements Task {
    private RetoChoucairPage retoChoucairPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(retoChoucairPage));
    }
}
