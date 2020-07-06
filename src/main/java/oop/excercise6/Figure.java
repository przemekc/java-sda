package oop.excercise6;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public abstract class Figure {

  public abstract BigDecimal calculateArea();

  public abstract BigDecimal calculateCircuit();

  protected void validateParameter(BigDecimal p) {
    if (p.compareTo(BigDecimal.valueOf(0)) != 1) {
      throw new IllegalArgumentException("Parameter must be greather then 0");
    }
  }
}
