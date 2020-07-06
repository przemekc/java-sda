package lambdas.excercise1;

import static java.lang.System.out;

public class Main {

  public static void main(String[] args) {
    StringProcessor processor = new StringProcessor();

    out.println("Defaultowe zachowaie");
    out.println(processor.process("abc"));

    out.println("Ustawienie operacji na uppercase");
    processor.setOperation(String::toUpperCase);
    out.println(processor.process("abc"));

    out.println("Ustawienie operacji na pierwszy trzy znaki");
    processor.setOperation(s -> s.substring(0, 3));
    out.println(processor.process("jakis ciekawy tekst"));
  }
}
