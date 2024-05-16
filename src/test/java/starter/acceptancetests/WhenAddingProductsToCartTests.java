package starter.acceptancetests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.demoblaze.questions.product.ProductQuestions;
import starter.demoblaze.home.Navigate;
import starter.demoblaze.product.SelectProduct;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenAddingProductsToCartTests {
    @CastMember(name = "Wendy")
    Actor wendy;

    @Test
    void checkTheProductData() {
        String name = "Nokia lumia 1520";
        String price = "$820";

        wendy.attemptsTo(
                Navigate.toTheHomePage(),
                SelectProduct.toTheShoppingCart(name),
                Ensure.that(ProductQuestions.productName()).isEqualTo(name),
                Ensure.that(ProductQuestions.productPrice()).contains(price)
        );
    }
}
