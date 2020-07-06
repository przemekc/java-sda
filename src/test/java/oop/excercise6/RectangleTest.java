package oop.excercise6;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.assertj.core.api.Assertions.assertThat;

public class RectangleTest {

  private static final Logger LOGGER = Logger.getLogger(RectangleTest.class);

  @Test
  public void shouldCalculateArea() {
    // given
    Rectangle rectangle = new Rectangle(BigDecimal.valueOf(3), BigDecimal.valueOf(4));
    LOGGER.info(rectangle.toString());
    // when
    BigDecimal result = rectangle.calculateArea();
    // then
    assertThat(result).isEqualTo(BigDecimal.valueOf(12).setScale(2, RoundingMode.HALF_UP));
  }

  @Test
  public void shouldCalculateCircuit() {
    // given
    Rectangle rectangle = new Rectangle(BigDecimal.valueOf(3), BigDecimal.valueOf(4));
    LOGGER.info(rectangle.toString());
    // when
    BigDecimal result = rectangle.calculateCircuit();
    // then
    assertThat(result).isEqualTo(BigDecimal.valueOf(14).setScale(2, RoundingMode.HALF_UP));
  }
}
