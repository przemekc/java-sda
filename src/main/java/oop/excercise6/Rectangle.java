package oop.excercise6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Rectangle extends Figure {

  private final BigDecimal a;
  private final BigDecimal b;

  public Rectangle(BigDecimal a, BigDecimal b) {
    this.a = Objects.requireNonNull(a);
    this.b = Objects.requireNonNull(b);
    validateParameter(this.a);
    validateParameter(this.b);
  }

  @Override
  public BigDecimal calculateArea() {
    return a.multiply(b)
        .setScale(2, RoundingMode.HALF_UP);
  }

  @Override
  public BigDecimal calculateCircuit() {
    return a.multiply(BigDecimal.valueOf(2))
        .add(b.multiply(BigDecimal.valueOf(2)))
        .setScale(2, RoundingMode.HALF_UP);
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "a=" + a +
        ", b=" + b +
        '}';
  }
}
