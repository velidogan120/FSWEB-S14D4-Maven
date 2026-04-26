package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Sweet", 10, "Milk chocolate");
        products[1] = new Coke("Drink", 5, "Cold beverage");
        products[2] = new Bread("Food", 3, "Fresh bread");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}