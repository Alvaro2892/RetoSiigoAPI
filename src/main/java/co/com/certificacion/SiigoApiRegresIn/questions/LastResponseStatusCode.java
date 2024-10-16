package co.com.certificacion.SiigoApiRegresIn.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

public class LastResponseStatusCode implements Question<Boolean>
{
    private int cod;
    public LastResponseStatusCode(int cod) {
        this.cod = cod;
    }
    public static LastResponseStatusCode is(int cod) {
        return new LastResponseStatusCode(cod);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        int response = LastResponse.received().answeredBy(actor).statusCode();
        return response == cod;
    }
}