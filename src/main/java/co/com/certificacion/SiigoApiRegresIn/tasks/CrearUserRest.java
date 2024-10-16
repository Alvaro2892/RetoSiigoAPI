package co.com.certificacion.SiigoApiRegresIn.tasks;

import co.com.certificacion.SiigoApiRegresIn.interactions.ConsumeService;
import co.com.certificacion.SiigoApiRegresIn.model.ModelCrearUsuarioApi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class CrearUserRest implements Task
{
    private List<ModelCrearUsuarioApi> modelCrearUsuarioApiList;

    public CrearUserRest(List<ModelCrearUsuarioApi> modelCrearUsuarioApiList) {
        this.modelCrearUsuarioApiList = modelCrearUsuarioApiList;
    }
    public static CrearUserRest with(List<ModelCrearUsuarioApi> modelCrearUsuarioApiList) {
        return Tasks.instrumented(CrearUserRest.class, modelCrearUsuarioApiList);
    }
    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(ConsumeService.withPost(modelCrearUsuarioApiList.get(0).toString()));
    }
}