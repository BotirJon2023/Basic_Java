package org.example.PracticeA5;

public class House implements Comparable<House> {

    private int houseNumber;
    private int area;
    private int price;
    private String city;

    public House(int houseNumber, int area, int price, String city) {
        this.houseNumber = houseNumber;
        this.area = area;
        this.price = price;
        this.city = city;
    }


    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "House{" +
                "house_number=" + houseNumber +
                ", area=" + area +
                ", price=" + price +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(House o) {
        if (this.area == o.area) {
            return 0;
        } else if (this.area < o.area) {
            return 1;
        } else if (this.area > o.area) {
            return -1;
        }

        return (int) (this.area - (int) o.area);
    }
}
