package Hash;

import java.util.Objects;

public class Product {
    private final String name;
    private final double prace;
    private final double quantitu;
    private boolean checked;


    public Product(String name, double prace, double quantitu) {
        if(name == null || name.isBlank() || prace < 0 || quantitu < 0){
            throw new IllegalArgumentException("Не заполнена карточка товара");
        }
        this.name = name;
        this.prace = prace;
        this.quantitu = quantitu;
        this.checked = false;
    }

    public String getName() {
        return name;
    }

    public double getPrace() {
        return prace;
    }

    public double getQuantitu() {
        return quantitu;
    }

    public boolean isChecked() {
        return checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void setChecked() {
        this.checked = true;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", prace=" + prace +
                ", quantitu=" + quantitu +
                ", checked=" + checked +
                '}';
    }
}
