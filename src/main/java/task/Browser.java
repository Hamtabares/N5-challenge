package task;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

import static ui.Browser.*;
import static ui.Login.*;

public class Browser implements Task {

    private EnvironmentVariables environmentVariables;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("webdriver.base.url")),
                Enter.keyValues(EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("user.credentials")).into(INGRESAR_EMAIL),
                Enter.keyValues(EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("password.credentials")).into(INGRESAR_PWD),
                Click.on(BOTON_INICIAR_SESION)

                );
        actor.attemptsTo(
                Click.on(PROFILE_SEL).afterWaitingUntilPresent());
    }

    public static Browser aLaPaginaPrincipal() {
        return Tasks.instrumented(Browser.class);
    }
}
