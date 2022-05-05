package pl.javastart.task;

import jdk.jfr.Category;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Category category1 = new Category("Słodkości", "Ciasta");
        System.out.println(category1);
        Category category2 = new Category("Dietetyczne","Torty wegańskie");
        System.out.println(category2);

        Product product1 = new Product("Ciasto", "83,9 zł", "Szarlotka", category1);
        System.out.println(product1);
        Product product2 = new Product("Ciasto", "95,0 zł", "Sernik", category1);
        System.out.println(product2);
        Product product3 = new Product("Tort", "135.90 zł", "Tort Leśny Mech", category2);
        System.out.println(product3);
        Product product4 = new Product("Upominek", "99.0 zł", "Słodka paczka", null);
        System.out.println(product4);

        SpecialOffer offer1 = new SpecialOffer( product1, "Promocja świąateczna",
                "Obowiązuje od 28 do 30 marca", 0.2);
        System.out.println(offer1);

        offer1.getDiscountPrice(product1);
        System.out.println("Cena produktu1 po obniżce 20% wynosi: " + "discount");

    }
}
//nie mogę znalezc bledu