package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Login {

    public static final Target INGRESAR_EMAIL = Target.the("ingresar correo")
            .locatedBy("#id_userLoginId");
    public static final Target INGRESAR_PWD = Target.the("ingresar contraseña")
            .locatedBy("#id_password");
    public static final Target BOTON_INICIAR_SESION = Target.the("iniciar sesion")
            .locatedBy("//button[@type='submit']");



}
