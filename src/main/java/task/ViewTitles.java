package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import utils.OperationData;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.apache.commons.collections.CollectionUtils.select;
import static ui.Browser.*;

public class ViewTitles implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(FILMS_SEL.waitingForNoMoreThan(Duration.ofSeconds(100))),
                Scroll.to(CATEGORY_BEFORE.waitingForNoMoreThan(Duration.ofSeconds(100))));
        actor.attemptsTo(
                Click.on(CATEGORY_SEL).afterWaitingUntilPresent()
        );

        WaitUntil.the(TEXT_1, isVisible()).forNoMoreThan(20).seconds();
        System.out.println("*********"+TEXT_1.resolveFor(actor).getText());
        OperationData.setDescriptionOpList(TEXT_1.resolveFor(actor).getText());
        OperationData.setDescriptionOpList(TEXT_2.resolveFor(actor).getText());
        OperationData.setDescriptionOpList(TEXT_3.resolveFor(actor).getText());

    }

    public static ViewTitles ver() {
        return Tasks.instrumented(ViewTitles.class);
    }
}
