package co.com.certificacion.SiigoApiRegresIn.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.com.certificacion.SiigoApiRegresIn.util.RestService.BASE_URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Hook
{
    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Alvaro").whoCan(CallAnApi.at(BASE_URL.toString()));
    }
}
