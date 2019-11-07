package co.udem.automatizacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.udem.automatizacion.page.ConsultaProcesosPage.TEXT_BARRA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class TextoBarra implements Question<String>
{

	@Override
	public String answeredBy(final Actor actor)
	{
		return TEXT_BARRA.resolveFor(actor).getText();
	}

	public static TextoBarra barra(){
		return new TextoBarra();
	}


}
