package Metodos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MetodosComunes  {


    //METODOS PARA REUTILIZAR
    public void MaximizarNavegador(WebDriver driver) {

        driver.manage().window().maximize();
    }

    public void BorraCoookies(WebDriver driver){

        driver.manage().deleteAllCookies();
    }

    public void NavegaraURL(WebDriver driver,String url){

        driver.get(url);
    }

    public WebElement EncontrarObjeto(WebDriver driver,By localizador){

       return driver.findElement(localizador);
    }

    public void HacerClick(WebDriver driver,By localizador){

     driver.findElement(localizador).click();
    }

    public String DevolverTituloPagina(WebDriver driver){

        String titulo=driver.getTitle();
        return titulo;
    }

    public void CompararCadenas(String cadenaActual,String cadenaEsperada){

        assertEquals(cadenaActual,cadenaEsperada);
    }

    public void PararProgramaPor(Integer TiempoaParar) throws InterruptedException {

        Thread.sleep(TiempoaParar);
    }

    public void EscribirEnObjeto(WebDriver driver,By localizador,String texto){

        driver.findElement(localizador).sendKeys(texto);
    }
    public String ObtenerTexto(WebDriver driver,By localizador){
      return  driver.findElement(localizador).getText();
    }

    public void CerrarNavegador(WebDriver driver) {

        driver.close();
    }

    public void CerrarDriver(WebDriver driver){

        driver.quit();
    }
}
