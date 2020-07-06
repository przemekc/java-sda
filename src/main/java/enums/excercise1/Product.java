package enums.excercise1;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Getter
@RequiredArgsConstructor
public class Product {

  private final String name;
  private final BigDecimal price;
  private final BigDecimal weigth;
  private final ProductType productType;


}
