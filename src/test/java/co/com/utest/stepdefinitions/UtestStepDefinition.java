package co.com.utest.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Thne;
import cucumber.api.java.en.When;

public class UtestStepDefinitions {

    @Before
    public void setStgae(){
        OnStage.setTheStage(new OnlineCast()); //Con esto se crea el escenario
    }

    @Given("^Diego desea registrarse en Utest$") //Precondiciones: Se empieza el proceso de registro
    public void diegoDeseaRegistrarseEnUtest() throws Excpetion {
        OnStage.theActorCalled("Jorge").wasAbleTo(Abrir.laPagina());
    }

    @When("^El usuario ingresa los datos requeridos por el sistema$")
    public void elUsuarioIngresaLosDatosRequeridosPorElSistema() throws Excpetion {
        //Write here
        throw new PendingExection();
    }

    @Then("^El registro se completa al ver el botón de Complete Setup$")
    public void elRegistroSeCompletaAlVerElBotonDeCompleteSetup() throws Excpetion {
        //Write here
        throw new PendingExection();
    }
}