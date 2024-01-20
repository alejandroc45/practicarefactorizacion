package Localizadores;

import org.openqa.selenium.By;

public class LocalizadoresPaginaInicio {

    //Localizadores de los objetos agrupados por pagina y utilizando XPATH
  public By BotonAceptarCookies;
  public By EnlaceCuenta;

    public LocalizadoresPaginaInicio(){
        BotonAceptarCookies=By.xpath("//button[@id='cookies-eu-accept']");
        EnlaceCuenta=By.xpath("//a[contains(text(),'Mi Cuenta')]");

    }
}
