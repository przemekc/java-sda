package oop.excercise1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// mozna tez z lombokiem - zamiast metod w kalsie
//@AllArgsConstructor
//@Getter
//@Setter
public class Car {

  private String brand;
  private String model;

  public Car(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String description() {
    return brand + " " + model;
  }
}
