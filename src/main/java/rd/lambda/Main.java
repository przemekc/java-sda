package rd.lambda;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        // class OperacjaKlasa implements Operacja {
        //        @Override
        //        public int apply(int a) {
        //            return 0;
        //        }
        // }

        // oldschool Java before 1.8
//        Operacja operacja = new Operacja() {
//            @Override
//            public int apply(int a) {
//                return a + 2;
//            }
//        };

        Operacja operacja = a -> a + 2;

        int result = operacja.apply(2);
        System.out.println(result);
    }

    @FunctionalInterface
    interface Operacja {

        int apply(int a);

    }
}
