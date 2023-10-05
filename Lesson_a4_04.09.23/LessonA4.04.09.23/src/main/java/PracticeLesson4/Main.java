package PracticeLesson4;

    public class Main {
        public static void main(String[] args) {
            PhysicalProduct physicalProduct = new PhysicalProduct("Phone", 500, 10);
            DigitalProduct digitalProduct = new DigitalProduct("Ebook", 20);

            physicalProduct.applyDiscountable(15);
            digitalProduct.applyDiscountable(25);

            System.out.println("Physical product price after discount: " + physicalProduct.getPrice());
            System.out.println("Digital product price after discount: " + digitalProduct.getPrice());
        }
    }


