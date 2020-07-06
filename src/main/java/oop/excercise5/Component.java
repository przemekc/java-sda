package oop.excercise5;


// dodalem dodatkowa klase - poza cwiczeniem (wg uznania)
// @Getter - mozna zamiast metody uzyc anotacji z lombok
public abstract class Component {

  private String name;

  public Component(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
