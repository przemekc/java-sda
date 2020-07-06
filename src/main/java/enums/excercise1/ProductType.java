package enums.excercise1;

import lombok.Getter;

@Getter
public enum ProductType {

  FRUITS("Fruits", "001"),
  VEGETABLES("Vegtables", "002"),
  MEAT("Meat", "003");

  private final String name;
  private final String code;

  ProductType(String name, String code) {
    this.name = name;
    this.code = code;
  }
}
