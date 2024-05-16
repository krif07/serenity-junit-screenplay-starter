package starter.demoblaze.home;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    /**
     * An action that opens the browser on the blaze demo home page
     */
    public static Performable toTheHomePage() {
        return Open.url("https://demoblaze.com/");
    }
}
