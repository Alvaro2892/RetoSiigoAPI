package co.com.certificacion.SiigoApiRegresIn.stepdefinitions;

import co.com.certificacion.SiigoApiRegresIn.model.ModelCrearUsuarioApi;
import co.com.certificacion.SiigoApiRegresIn.questions.LastResponseStatusCode;
import co.com.certificacion.SiigoApiRegresIn.tasks.CrearUserRest;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static co.com.certificacion.SiigoApiRegresIn.util.Constante.VALUE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepCrearUsuario
{
    @DataTableType
    public ModelCrearUsuarioApi defineUser(Map<String, String> entry) {
        return new ModelCrearUsuarioApi(
                entry.get("name"),
                entry.get("job")
        );
    }

    @When("el usuario crea un usuario")
    public void elUsuarioCreaUnUsuario(List<ModelCrearUsuarioApi> modelCrearUsuarioApiList)
    {
        theActorInTheSpotlight().attemptsTo(CrearUserRest.with(modelCrearUsuarioApiList));
    }
    @Then("deberia ver un mensaje de usuario creado y codigo de respuesta adecuado")
    public void deberiaVerUnMensajeDeUsuarioCreadoYCodigoDeRespuestaAdecuado()
    {
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE)));
    }

}
