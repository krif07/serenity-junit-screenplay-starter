package starter.demoblaze.questions.product;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.demoblaze.product.ProductForm;

/**
 * Represents information appearing on product
 */
public class ProductQuestions {
    public static Question<String> productName() {
        return Text.of(ProductForm.PRODUCT_NAME_LABEL);
    }
    public static Question<String> productPrice() {
        return Text.of(ProductForm.PRODUCT_PRICE_LABEL);
    }
}
