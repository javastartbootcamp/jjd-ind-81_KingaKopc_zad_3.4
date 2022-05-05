package pl.javastart.task;

public class SpecialOffer {

       Product product1;
        String description;
        String duration;
        double discount;
        double price = 83.90;


        SpecialOffer(  Product p1, String d, String dur, double dis){
            product1  = p1;
            description = d;
            duration = dur;
            discount = dis;

        }
        void getDiscountPrice(Product product1){
            discount = price * 0.8;
        }
}
