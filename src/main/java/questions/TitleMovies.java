package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utils.OperationData;

public class TitleMovies implements Question {
    private final String question;

    public TitleMovies(String question) {
        this.question = question;
    }

    public static TitleMovies ofNetflix(String question) {
        return new TitleMovies(question);
    }

    @Override
    public Object answeredBy(Actor actor) {
        String movies = OperationData.getDescriptionOpList().get(0);
        String movies1 = OperationData.getDescriptionOpList().get(1);
        String movies2 = OperationData.getDescriptionOpList().get(2);
        System.out.println("movies = " + movies);
        return question.contains(movies) || OperationData.getDescriptionOpList().get(1).contains(movies1) || OperationData.getDescriptionOpList().get(2).contains(movies2);
    }
}
