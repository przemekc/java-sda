package exceptions;

public class ThrowExceptionMain {

  // error not handled
  public static void main(String[] args) {
    test();
  }

  private static void test() throws IllegalStateException {
    if (true) {
      throw new IllegalStateException("Nieprawidłowy stan systemu");
    }
    System.out.println("after error");
  }
}
