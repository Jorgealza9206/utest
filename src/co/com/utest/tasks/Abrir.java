package co.com.utest.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task{

    private PaginaUtest pagina; //Recibe o crea un objeto de la clase PaginaUtest

    public static Abrir laPagina() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pagina),
                Click.on(PaginaUtest.JOIN));
    }

}

