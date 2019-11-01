package co.udem.automatizacion.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("https://www.ramajudicial.gov.co/")
public class RamaJudicialInicioPage extends PageObject
{
	public static final Target BTN_CONSULTAR_PROCESOS = Target.the("Boton consulta de procesos").locatedBy("//div[@id='frecMenu']/h4[1]/a");

}
