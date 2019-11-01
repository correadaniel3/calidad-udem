package co.udem.automatizacion.stepdefinitions;

import co.udem.automatizacion.page.RamaJudicialInicioPage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.udem.automatizacion.page.ConsultaProcesosPage.SEL_CIUDAD;
import static co.udem.automatizacion.page.ConsultaProcesosPage.SEL_ENTIDAD;
import static co.udem.automatizacion.page.ConsultaProcesosPage.SEL_NRO_RADICADO;
import static co.udem.automatizacion.page.ConsultaProcesosPage.TEXT_BARRA;
import static co.udem.automatizacion.page.RamaJudicialInicioPage.BTN_CONSULTAR_PROCESOS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static org.hamcrest.core.IsEqual.equalTo;


public class ConsultaProcesosSteps
{

	@Before
	public void setTheStage() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Dado("que \"(.*)\" esta consultando el proceso judicial")
	public void consultarProcesoJudicial(String actor) {
		theActorCalled(actor).attemptsTo(
				Open.browserOn().the(RamaJudicialInicioPage.class),
				WaitUntil.the(BTN_CONSULTAR_PROCESOS,isClickable())
				,Click.on(BTN_CONSULTAR_PROCESOS)
		);
	}

	@Cuando("selecciona Ciudad \"(.*)\", entidad \"(.*)\" y numero de radicado \"(.*)\"")
	public void ingresarCiudadEntidadRadicado(String ciudad, String entidad, String radicado) {

		theActorInTheSpotlight().attemptsTo(
				SelectFromOptions.byVisibleText(ciudad).from(SEL_CIUDAD),
				SelectFromOptions.byVisibleText(entidad).from(SEL_ENTIDAD),
				Enter.theValue(radicado).into(SEL_NRO_RADICADO)
		);
	}

	@Entonces("debe poder activar la consulta")
	public void verificarActivacionConsulta() {
		theActorInTheSpotlight().should(seeThat("The displayed username",,
				equalTo("")));
	}

}
