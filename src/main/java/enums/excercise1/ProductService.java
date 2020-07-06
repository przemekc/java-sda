package enums.excercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ProductService {

  private final List<Product> products = new ArrayList<>();

  public void addProduct(Product product) {
    products.add(product);
  }

  public List<Product> retriveByType(ProductType productType) {
    // old school
    //    List<Product> result = new ArrayList<>()
    //    for (Product product : products) {
    //      if(product.getProductType().equals(productType)) {
    //        result.add(product);
    //      }
    //    }
    //    return products;

    // new school stream API
    return products.stream()
        .filter(p -> p.getProductType().equals(productType))
        .collect(toList());
  }

  public List<Product> getProducts() {
    return Collections.unmodifiableList(products);
  }
}
