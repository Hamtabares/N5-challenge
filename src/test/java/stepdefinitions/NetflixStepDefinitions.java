package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.TitleMovies;
import task.Browser;
import task.ViewTitles;
import utils.OperationData;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NetflixStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("{string} navega a la pagina principal")
    public void navega_a_la_pagina_principal(String actor) throws InterruptedException {
        theActorCalled(actor).attemptsTo(Browser.aLaPaginaPrincipal());
    }

    @Cuando("el selecciona la opcion")
    public void el_selecciona_la_opcion() {
        theActorInTheSpotlight().attemptsTo(ViewTitles.ver());

    }

    @Cuando("el obtiene el titulo de {int} peliculas")
    public void el_obtiene_el_titulo_de_peliculas(Integer int1) {
        OperationData.getDescriptionOpList().get(OperationData.getDescriptionOpList().size() - 1);
    }

    @Entonces("el usuario visualiza las peliculas (.*)$")
    public void el_usuario_visualiza_las_peliculas(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TitleMovies.ofNetflix(question)));


    }

}
