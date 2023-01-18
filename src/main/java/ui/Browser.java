package ui;

import net.serenitybdd.screenplay.targets.Target;

public class Browser {

    public static final Target PROFILE_SEL = Target.the("ingresar a perfil hamilton")
            .locatedBy("//span[text()='Hamilton']");
    public static final Target FILMS_SEL = Target.the("seleccionar peliculas")
            .locatedBy("//li//a[text()='Películas']");
    public static final Target CATEGORY_BEFORE = Target.the("seleccionar la categoria")
            .locatedBy("//*[text()='Películas emocionantes']");
        public static final Target CATEGORY_SEL = Target.the("seleccionar la categoria")
            .locatedBy("//*[text()='Tendencias']");
    public static final Target TEXT_1 = Target.the("lista a titulos")
            .locatedBy("//*[@id='title-card-0-0']/div[1]/a/div[1]/img");
    public static final Target TEXT_2 = Target.the("lista a titulos").
            locatedBy("//*[@id='title-card-0-1']/div[1]/a/div[1]/img");
    public static final Target TEXT_3 = Target.the("lista a titulos")
            .locatedBy("//*[@id='title-card-0-2']/div[1]/a/div[1]/img");

}
