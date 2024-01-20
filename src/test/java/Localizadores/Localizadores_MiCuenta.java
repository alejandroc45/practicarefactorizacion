package Localizadores;

import org.openqa.selenium.By;

public class Localizadores_MiCuenta {
    //Localizadores de los objetos agrupados por pagina y utilizando XPATH

   public  By CampoUsuario;
   public  By CampoPassword;
   public By BotonEnviar;
   public By CabeceraMiCuenta;
   public By EnlaceSalir;
   public By EnlacePedidos;

   public Localizadores_MiCuenta(){

       CampoUsuario=By.xpath("//input[@id='username']");
       CampoPassword=By.xpath("//input[@id='password']");
       BotonEnviar=By.xpath("//button[contains(text(),'Acceso')]");
       CabeceraMiCuenta=By.xpath("//h1[contains(text(),'Mi Cuenta')]");
       EnlaceSalir=By.xpath("//a[contains(text(),'Salir')]");
       EnlacePedidos=By.xpath("//a[contains(text(),'Pedidos')]");

   }
}
