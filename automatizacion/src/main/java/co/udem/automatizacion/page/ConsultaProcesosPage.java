package co.udem.automatizacion.page;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class ConsultaProcesosPage extends PageObject
{
	public static final Target SEL_CIUDAD = Target.the("Select Box de ciudad").locatedBy("//*[@id=\"ddlCiudad\"]");
	public static final Target SEL_ENTIDAD = Target.the("Select Box de entidad").locatedBy("//*[@id=\"ddlEntidadEspecialidad\"]");

	public static final Target SEL_NRO_RADICADO = Target.the("Select Box de Entidad").located(By.xpath("//div[@id='divNumRadicacion']//tr[.//h1[contains(.,'Número de Radicación')]]/following-sibling::tr[1]//input"));
	public static final Target TEXT_BARRA = Target.the("Select Box de Entidad").located(By.xpath("//*[@id=\"ConsultarNum\"]"));
}
