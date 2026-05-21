package co.com.utest.userinterface;

public class PaginaInfoPersonal {

    public static final Target PRIMER_NOMBRE = Target.the("Primer nombre")
            .located(By.id("firstName"))
    public static final Target APELLIDO = Target.the("Apellido")
            .located(By.id("lastName"))
    public static final Target EMAIL = Target.the("Email")
            .located(By.id("email"))
    public static final Target MES_NACIMIENTO = Target.the("Mes de nacimiento")
            .located(By.xpath("/html/body/ui-view/ui-view-ng-upgrade/ui-view/ut-unified-registration-layout/div/div[2]/div/ut-unified-registration-form/div/div/form/div[3]/div/div/div[1]/select"))
    public static final Target DIA_NACIMIENTO= Target.the("Día de Nacimiento")
            .located(By.xpath("/html/body/ui-view/ui-view-ng-upgrade/ui-view/ut-unified-registration-layout/div/div[2]/div/ut-unified-registration-form/div/div/form/div[3]/div/div/div[2]/select"))
    public static final Target ANO_NACIMIENTO = Target.the("Año de Nacimiento")
            .located(By.xpath("/html/body/ui-view/ui-view-ng-upgrade/ui-view/ut-unified-registration-layout/div/div[2]/div/ut-unified-registration-form/div/div/form/div[3]/div/div/div[3]/select"))
    public static final Target BOTON_DIRECCION = Target.the("Botón que lleva a la sección Dirección")
            .located(By.xpath("//a[@class='btn-create-account']"));
}
