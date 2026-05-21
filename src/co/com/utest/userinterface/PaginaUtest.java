package co.com.utest.userinterface;

//Archivo para mapear las variables del navegador
import net.thucydes.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com/")
public class PaginaUtest extends PageObject{

    public static final Target JOIN = Target.the("Boton para iniciar registro").
            located(By.xpath("a[@class='unauthenticated-nav-bar__sign-up']"));
            //Dice que está dentro de un 'a' en una clase llamada una...

}

