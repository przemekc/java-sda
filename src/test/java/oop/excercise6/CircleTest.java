package oop.excercise6;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class CircleTest {

  private static final Logger LOGGER = Logger.getLogger(CircleTest.class);

  @Test
  public void shouldCalculateArea() {
    // given
    Circle circle = new Circle(BigDecimal.valueOf(4));
    LOGGER.info(circle.toString()); // zalogowanie przez LOGGER
    // when
    BigDecimal result = circle.calculateArea();
    // then
    assertThat(result).isEqualTo(BigDecimal.valueOf(50.27));
  }

  @Test
  public void shouldCalculateCircuit() {
    // given
    Circle circle = new Circle(BigDecimal.valueOf(4));
    LOGGER.info(circle.toString()); // zalogowanie przez LOGGER
    // when
    BigDecimal result = circle.calculateCircuit();
    // then
    assertThat(result).isEqualTo(BigDecimal.valueOf(25.13));
  }
}
