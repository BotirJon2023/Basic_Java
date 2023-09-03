package Products;

import java.util.ArrayList;

public class ShopManager {

    public static void main(String[] args) {
        Product product1 = new Product(1, ProductCategory.SUITS, 449.99, Currency.EUR);
        Product product2 = new Product(2, ProductCategory.SUITS, 549.99, Currency.USD);
        Product product3 = new Product(3, ProductCategory.SUITS, 649.99, Currency.EUR);
        Product product4 = new Product(4, ProductCategory.SUITS, 749.99, Currency.USD);
        Product product5 = new Product(5, ProductCategory.SUITS, 849.99, Currency.EUR);
        Product product6 = new Product(6, ProductCategory.PULLOVERS, 49.99, Currency.EUR);
        Product product7 = new Product(7, ProductCategory.PULLOVERS, 59.99, Currency.USD);
        Product product8 = new Product(8, ProductCategory.PULLOVERS, 69.99, Currency.EUR);
        Product product9 = new Product(9, ProductCategory.CHINOS, 85.99, Currency.EUR);
        Product product10 = new Product(10, ProductCategory.CHINOS, 89.99, Currency.USD);
        Product product11 = new Product(11, ProductCategory.CHINOS, 99.99, Currency.EUR);
        Product product12 = new Product(12, ProductCategory.CHINOS, 109.99, Currency.USD);
        Product product13 = new Product(13, ProductCategory.CHINOS, 119.99, Currency.EUR);
        Product product14 = new Product(14, ProductCategory.CHINOS, 79.99, Currency.USD);

        ArrayList <Product> products = new ArrayList<>();
        addProduct(products, product1);
        addProduct(products, product2);
        addProduct(products, product3);
        addProduct(products, product4);
        addProduct(products, product5);
        addProduct(products, product6);
        addProduct(products, product7);
        addProduct(products, product8);
        addProduct(products, product9);
        addProduct(products, product10);
        addProduct(products, product11);
        addProduct(products, product12);
        addProduct(products, product13);
        addProduct(products, product14);

        System.out.println(products);
        System.out.println();

        getProductsByCategory(products, ProductCategory.SUITS);
        System.out.println();

        double minPrice = 49.99;
        double maxPrice = 849.99;
        Currency currency = Currency.USD;
        getProductsByPriceRange(minPrice,maxPrice,currency,products);

    }

    private static void addProduct(ArrayList<Product> products, Product product) {
        products.add(product);
    }

    private static void getProductsByCategory (ArrayList<Product> products, ProductCategory category) {
        for (Product product : products) {
            if (product.getName() == category) {
                System.out.println(product);
            }
        }
    }

    private static void getProductsByPriceRange (double minPrice, double maxPrice, Currency currency, ArrayList<Product> products){
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice && product.getCurrency().equals(currency) ) {
                System.out.println(product);
            }
        }
    }



}
