package oop.excercise6;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

  private static final Logger LOGGER = Logger.getLogger(TriangleTest.class);

  @Test
  public void shouldCalculateArea() {
    // given
    Triangle triangle = new Triangle(
        BigDecimal.valueOf(3),
        BigDecimal.valueOf(6),
        BigDecimal.valueOf(6),
        BigDecimal.valueOf(5.80)
    );

    LOGGER.info(triangle.toString());
    // when
    BigDecimal result = triangle.calculateArea();
    // then
    assertThat(result).isEqualTo(BigDecimal.valueOf(8.70).setScale(2, RoundingMode.HALF_UP));
  }

  @Test
  public void shouldCalculateCircuit() {
    // given
    Triangle triangle = new Triangle(
        BigDecimal.valueOf(3),
        BigDecimal.valueOf(6),
        BigDecimal.valueOf(6),
        BigDecimal.valueOf(10)
    );
    LOGGER.info(triangle.toString());
    // when
    BigDecimal result = triangle.calculateCircuit();
    // then
    assertThat(result).isEqualTo(BigDecimal.valueOf(15).setScale(2, RoundingMode.HALF_UP));
  }
}
