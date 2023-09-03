package Products;


public class Clothing extends Product {

    private Size size;

    public Clothing(int id, ProductCategory productCategory, double prise, Currency currency) {
        super(id, productCategory, prise, currency);
        this.size = size;

    }


    @Override
    public String toString() {
        return "Clothing{" +
                "id=" + getId() +
                ", name=" + getName() +
                ", price=" + getPrice() +
                ", currency=" + getCurrency() +
                ", size=" + size +
                '}';

    }
}
