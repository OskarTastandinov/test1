package HW1_2_product_list;

import java.util.*;

public class Recipe {

    private String recipeName;
    private final Set<Product> products;

    public Recipe(String recipeName, Set<Product> products) {
        if (recipeName == null || recipeName.isBlank() || products == null || products.size() == 0) {
            throw new IllegalArgumentException("Заполните поля полностью");
        }
        this.recipeName = recipeName;
        this.products = products;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public int getTotalPrice() {
        int summa = 0;
        for (Product product : products) {
            summa = summa + product.getPrice();

        }
        return summa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipes = (Recipe) o;
        return Objects.equals(recipeName, recipes.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }
}
