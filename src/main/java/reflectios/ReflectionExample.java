package reflectios;

import java.lang.reflect.Method;

import static java.lang.System.out;

public class ReflectionExample {

  public static void main(String[] args) {
    for (Method method : ExampleClass.class.getMethods()) {
      out.println(method);
    }

    out.println("Call testHidden");
    out.println("");
    try {
      ExampleClass obj = new ExampleClass();
      Method method = obj.getClass().getDeclaredMethod("testHidden");
      method.setAccessible(true);
      method.invoke(obj);
    } catch (Exception e) {
      out.println(e.getMessage());
    }

  }
}
