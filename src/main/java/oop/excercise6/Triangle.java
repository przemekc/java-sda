package oop.excercise6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Triangle extends Figure {

  private final BigDecimal a;
  private final BigDecimal b;
  private final BigDecimal c;
  private final BigDecimal h;

  public Triangle(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal h) {
    this.a = Objects.requireNonNull(a);
    this.b = Objects.requireNonNull(b);
    this.c = Objects.requireNonNull(c);
    this.h = Objects.requireNonNull(h);
//    this.h = calculateH();
    validateParameter(this.a);
    validateParameter(this.b);
    validateParameter(this.c);
    validateParameter(this.h);
  }

  private BigDecimal calculateH() {
    return a.multiply(b).divide(c, RoundingMode.HALF_UP)
        .setScale(2, RoundingMode.HALF_UP);
  }

  @Override
  public BigDecimal calculateArea() {
    return (a.multiply(h)).divide(BigDecimal.valueOf(2), RoundingMode.HALF_UP)
        .setScale(2, RoundingMode.HALF_UP);
  }

  @Override
  public BigDecimal calculateCircuit() {
    return a.add(b).add(c).setScale(2, RoundingMode.HALF_UP);
  }

  @Override
  public String toString() {
    return "Triangle{" +
        "a=" + a +
        ", b=" + b +
        ", c=" + c +
        ", h=" + h +
        '}';
  }
}
