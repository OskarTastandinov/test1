package HW1_2_product_list;

import java.util.Objects;

public class Product {
    private String nameProduct;
    private int price;
    private int amount;

    private boolean buy;

    public Product(String nameProduct, int price, int amount) {
        if (nameProduct == null || nameProduct.isBlank() || price < 0 || amount < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.nameProduct = nameProduct;
        this.price = price;
        this.amount = amount;
        this.buy = true;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setBuy() {
        this.buy = true;
    }

    public boolean isBuy() {
        return buy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameProduct, product.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct);
    }

    @Override
    public String toString() {
        String buyString = this.isBuy() ? "+":"-";
        return String.format("%s, Стоимость - %s, Количество - %s, Куплен - %s",
                this.nameProduct, this.price,
                this.amount, buyString);
    }

}
