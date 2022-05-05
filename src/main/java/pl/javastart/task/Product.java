package pl.javastart.task;

public class Product {
    String name;
    String price;
    String description;
    Category category;

    Product(String n, String p,String d, Category c){
        name = n;
        price = p;
        description = d;
        category =  c;
    }
}

