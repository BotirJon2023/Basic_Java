package Products;


public class Product {

    private int id;
    private ProductCategory name;
    private double price;
    private Currency currency;

    public Product (int id, ProductCategory productCategory, double prise, Currency currency) {
        this.id = id;
        this.name = productCategory;
        this.price = prise;
        this.currency = currency;

    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name=" + name +
                ", price=" + price +
                ", currency=" + currency +
                '}';

    }

    public int getId() {
        return id;
    }

    public ProductCategory getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }
}
