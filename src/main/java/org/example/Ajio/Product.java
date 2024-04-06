package org.example.Ajio;

public class Product {
    public String type;
    public double price;
    public String barCode;
    public String brand;
    public ProductSpecification productSpecification;

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", barCode='" + barCode + '\'' +
                ", brand='" + brand + '\'' +
                ", productSpecification=" + productSpecification +
                '}';
    }
}
