package semenar_1;

/*
* Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
* содержащий в себе методы initProducts (List <Product>)
* сохраняющий в себе список исходных продуктов и getProduct(String name)
* */

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}

class VendingMachine {
    private ArrayList<Product> products;

    public void initProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Product getProduct(String prodName) {
        for (Product p : products) {
            if (p.getName().equals(prodName)) {
                return p;
            }
        }
        return null;
    }
}

public class Quest1 {
    public static void main(String[] args) {
        ArrayList<Product> prods = new ArrayList<>();
        prods.add(new Product("Хлеб", 40.0));
        prods.add(new Product("Молоко", 80.0));
        prods.add(new Product("Колбаса", 120.0));
        prods.add(new Product("Сыр", 150.0));

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.initProducts(prods);
        System.out.println((vendingMachine.getProduct("Сыр")));
    }
}