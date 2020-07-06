package enums.excercise1;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static enums.excercise1.ProductType.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductServiceTest {

  @Test
  public void shouldRetriveFruit() {
    // given
    ProductService productService = new ProductService();

    Product apples = new Product("Apples", BigDecimal.valueOf(2.5), BigDecimal.valueOf(1), FRUITS);
    productService.addProduct(apples);
    productService.addProduct(new Product("Chicken", BigDecimal.valueOf(12.5), BigDecimal.valueOf(0.5), MEAT));
    productService.addProduct(new Product("Cucumbers", BigDecimal.valueOf(0.3), BigDecimal.valueOf(3), VEGETABLES));

    // when
    List<Product> products = productService.retriveByType(FRUITS);

    // tehn
    assertThat(productService.getProducts()).hasSize(3);
    assertThat(products).hasSize(1);
    assertThat(products.get(0)).isEqualTo(apples);
  }
}
