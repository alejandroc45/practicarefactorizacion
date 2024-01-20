package CP_TiendaVirtual;
import Metodos.MetodosComunes;
import PasosCP.PasosLoginEnTiendaVirtual;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.*;


/**
 * cp funcional automatizado de login en tienda virtual con un usuario registrado
 *
 */
public class LoginEnTiendaVirtual
{
    //Objetos
    private static WebDriver driver;
    private PasosLoginEnTiendaVirtual pasosCP=new PasosLoginEnTiendaVirtual();
    private static MetodosComunes MC=new MetodosComunes();





    //Configurar controlador de Chrome
    public static void setUpDriver(){
        WebDriverManager.edgedriver().setup();
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setAcceptInsecureCerts(true);
        edgeOptions.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(edgeOptions);

    }

    //Arrancar controlador de Chrome
    @BeforeEach
    public void setUpClass(){
     setUpDriver();

    }

    //Cerramos todo
    @AfterAll
    public static void tearDownAfterClass() throws Exception {
        //Cerramos navegador
        MC.CerrarNavegador(driver);
        //Cerramos Controlador o Driver
        MC.CerrarDriver(driver);
    }

    //Prueba login en tienda
    @Test
    public void LoginEnTiendaVirtual() throws InterruptedException{

        //Pasos del caso de prueba
        pasosCP.AccederPaginaWeb(driver);
        pasosCP.AceptarCookies(driver);
        pasosCP.ComprobarTituloPagina(driver);
        MC.PararProgramaPor(2000);
        pasosCP.AccederAMiCuenta(driver);
        pasosCP.Login(driver);
        pasosCP.ComprobarTextoDeCabeceraYPedidosEnMiCuenta(driver);
        pasosCP.CerrarSesion(driver);


}

}
