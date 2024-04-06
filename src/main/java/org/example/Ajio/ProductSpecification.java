package org.example.Ajio;

public class ProductSpecification {
    public String color;

    public int size;
    public double price;

    @Override
    public String toString() {
        return "ProductSpecification{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
