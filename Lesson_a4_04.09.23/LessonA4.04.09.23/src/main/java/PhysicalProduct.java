import PracticeLesson4.Product;
import PracticeLesson4.applyDiscountable;
import PracticeLesson4.shippingCharge;

public class PhysicalProduct extends Product implements applyDiscountable, shippingCharge {


    @Override
    public void Discount(double percentage) {

    }

    @Override
    public void delivery(double charge) {

    }
}
