package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Category category1 = new Category("Słodkości", "Ciasta");
        System.out.println("Kategoria1: " + category1.name + " " +
                "Opis kategorii1: " + category1.description + " ");
        Category category2 = new Category("Dietetyczne", "Torty wegańskie");
        System.out.println("Kategoria2: " + category2.name + " " +
                "Opis kategorii2: " + category2.description + " ");

        Product product1 = new Product("Ciasto", 100.0, " Szarlotka ", category1);
        System.out.println("Produkt1: " + product1.name + " " + product1.price + " " +
                product1.description + " " + category1.name + " ");
        Product product2 = new Product("Ciasto", 95.0, " Sernik ", category1);
        Product product3 = new Product("Tort", 135.90, "Tort Leśny Mech", category2);
        Product product4 = new Product("Upominek", 99.0, "Słodka paczka", null);

        SpecialOffer offer1 = new SpecialOffer(product1, "Promocja świąteczna",
                "Obowiązuje od 28 do 30 marca", 0.2);
        System.out.println("Oferta specjalna: " + product1.description + " " + offer1.description + " "
                + offer1.duration + " " + offer1.discount + " ");

        double offer = offer1.getDiscountPrice(product1);
        System.out.println("Cena produktu1 po obniżce 20% wynosi: " + offer);

    }
}
//poprawione zgodnie z uwagami