package co.com.utest.tasks;

import co.com.utest.datos.UtestDatos;
import net.serenitybdd.screenplay.Task;

public class Llenar implements Task{

    private List<UtestDatos> datos;

    public Llenar(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static Llenar laPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(Llenar.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pagina),
                Click.on(PaginaUtest.JOIN));
    }
}
