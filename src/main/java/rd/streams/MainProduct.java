package rd.streams;

public class MainProduct {

    public static void main(String[] args) {
        Product product = Product.builder()
                .withName("Laptop")
                .withSize(15)
                .build();
    }
}
