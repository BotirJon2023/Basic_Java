package practice;

public class Car {

        private double price;

        private String model;

    public Car(double price, String model) {
        this.price = price;
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }



    @Override
    public String toString() {
        return "+Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}

