package rd.lambda;

import java.util.Optional;
import java.util.function.Supplier;

public class MainSupplier {

    public static void main(String[] args) {

        Supplier supplier = () -> "Jan";

        String name = Optional.<String>ofNullable("Piotr")
                .orElseGet(supplier);
        System.out.println(name);
    }
}
