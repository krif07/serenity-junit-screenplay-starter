package starter.demoblaze.cart;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.demoblaze.home.DemoBlazeHomeForm;

public class Navigate {
    public static Performable toTheShoppingCart() {
        Target target = DemoBlazeHomeForm.MENU_CART_LINK;
        return Task.where("{0} goes to the shopping cart",
                WaitUntil.the(target, WebElementStateMatchers.isClickable())
                        .forNoMoreThan(10).seconds()
        );
    }
}
