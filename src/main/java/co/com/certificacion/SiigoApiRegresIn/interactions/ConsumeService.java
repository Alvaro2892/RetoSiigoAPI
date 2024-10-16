package co.com.certificacion.SiigoApiRegresIn.interactions;

import net.serenitybdd.screenplay.Tasks;

public class ConsumeService
{

    public static WithPost withPost(String body)
    {
        return Tasks.instrumented(WithPost.class,body);
    }

}
