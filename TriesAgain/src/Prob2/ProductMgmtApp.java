package Prob2;

import Prob2.model.Product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ProductMgmtApp {

    public static void main(String[] args) {
        Product[] products = {
                new Product(9801264, "Banana", 1.98f),
                new Product(9801262, "Carrot", 0.25f),
                new Product(9801263, "Pear", 2.42f),
                new Product(9801261, "Apple", 1.57f),
                new Product(9801265, "Banana", 1.99f)
        };
        sortProducts(products);
        Arrays.asList(products).forEach(System.out::println);
    }

    /**
     * Sorts the array of Products in ascending order by name
     * and then in descending order by their unitPrices; by using
     * a Comparator implemented and passed-in as an anonymous inner
     * class or a lambda expression, to the Arrays.sort(...) method.
     * @param products
     */
    private static void sortProducts(Product[] products) {
        //TODO - Implement this method call below
        //Arrays.sort(products, Comparator<? super Product>);
    	Comparator<? super Product> sortProduct= Comparator.comparing(Product::getName).reversed()
    			.thenComparing(Product::getUnitPrice).reversed();
    	
    	Arrays.sort(products, sortProduct);

    }
}
