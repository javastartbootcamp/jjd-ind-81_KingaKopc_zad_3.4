package pl.javastart.task;

public class SpecialOffer {

    Product product;
    String description;
    String duration;
    double discount;

    SpecialOffer(Product p1, String d, String dur, double dis) {
        product = p1;
        description = d;
        duration = dur;
        discount = dis;
    }

    double getDiscountPrice(Product product1) {
        return product1.price * (1 - discount);
    }
}
