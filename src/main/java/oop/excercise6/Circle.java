package oop.excercise6;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Objects;

public class Circle extends Figure {

  public static final BigDecimal PI = BigDecimal.valueOf(Math.PI);

  private final BigDecimal r;

  public Circle(BigDecimal r) {
    this.r = Objects.requireNonNull(r);
    validateParameter(this.r);
  }

  @Override
  public BigDecimal calculateArea() {
    return r.multiply(r).multiply(PI)
        .setScale(2, RoundingMode.HALF_UP);
  }

  @Override
  public BigDecimal calculateCircuit() {
    return BigDecimal.valueOf(2).multiply(PI).multiply(r)
        .setScale(2, RoundingMode.HALF_UP);
  }

  @Override
  public String toString() {
    return "Circle{" +
        "r=" + r +
        '}';
  }
}
