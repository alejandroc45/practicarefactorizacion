package PasosCP;

import Datos.Datos_MiCuenta;
import Localizadores.Localizadores_MiCuenta;
import Localizadores.Localizadores_PaginaInicio;
import Metodos.MetodosComunes;
import org.openqa.selenium.WebDriver;

public class Pasos_LoginEnTiendaVirtual {

    private static MetodosComunes metodosComunes=new MetodosComunes();
    private Datos_MiCuenta datosMiCuenta=new Datos_MiCuenta();
    private Localizadores_MiCuenta localizadoresMiCuenta=new Localizadores_MiCuenta();
    private Localizadores_PaginaInicio localizadoresPaginaInicio=new Localizadores_PaginaInicio();

    public Pasos_LoginEnTiendaVirtual(){

    }

    public void AccederPaginaWeb( WebDriver driver){
        metodosComunes.MaximizarNavegador(driver);
        metodosComunes.BorraCoookies(driver);
        metodosComunes.NavegaraURL(driver,datosMiCuenta.URL);
    }
    public void AceptarCookies(WebDriver driver){
        metodosComunes.HacerClick(driver,localizadoresPaginaInicio.BotonAceptarCookies);
    }

    public void ComprobarTituloPagina(WebDriver driver){
      String Titulo=  metodosComunes.DevolverTituloPagina(driver);
      metodosComunes.CompararCadenas(Titulo,"Inicio -");

    }

    public void AccederAMiCuenta(WebDriver driver){
        metodosComunes.HacerClick(driver,localizadoresPaginaInicio.EnlaceCuenta);
    }

    public void Login(WebDriver driver){
        metodosComunes.EscribirEnObjeto(driver,localizadoresMiCuenta.CampoUsuario,datosMiCuenta.Usuario);
        metodosComunes.EscribirEnObjeto(driver,localizadoresMiCuenta.CampoPassword,datosMiCuenta.Password);
        metodosComunes.HacerClick(driver,localizadoresMiCuenta.BotonEnviar);
    }

    public  void ComprobarTextoDeCabeceraYPedidosEnMiCuenta(WebDriver driver){
       String textoCabecera= metodosComunes.ObtenerTexto(driver,localizadoresMiCuenta.CabeceraMiCuenta);
       String textoPedidos= metodosComunes.ObtenerTexto(driver,localizadoresMiCuenta.EnlacePedidos);
       metodosComunes.CompararCadenas(textoCabecera,"Mi Cuenta");
        metodosComunes.CompararCadenas(textoPedidos,"Pedidos");
    }

    public void CerrarSesion(WebDriver driver){
        metodosComunes.HacerClick(driver,localizadoresMiCuenta.EnlaceSalir);
    }

}
