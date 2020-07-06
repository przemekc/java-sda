package oop.excercise4;

import static java.lang.System.*;

public class Main {

  public static void main(String[] args) {
    Test1 ref = null;

    Test2 test2 = new Test2();
    Test3 test3 = new Test3();

    ref = test2; // moge przypisac
    ref.test();
    test2.test();
    // ten sam wynik wykonania metody
    out.println("==================");

    ref = test3; // moge przypisac
    ref.test();
    test3.test();
    // ten sam wynik wykonania metody
    out.println("==================");

    // test2 = test3 // blad kompilacji nie moge przypisac

  }
}
