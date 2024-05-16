package starter.demoblaze.cart;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartForm {
    public static final Target CART_TITLE_LABEL = Target.the("cart title label")
            .locatedBy("(//div[@id='page-wrapper']//h2)[1]");
}
