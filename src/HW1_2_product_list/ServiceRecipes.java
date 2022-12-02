package HW1_2_product_list;

import java.util.HashSet;
import java.util.Set;

public class ServiceRecipes {

    private final Set<Recipe> recipes = new HashSet<>();

    public void add (Recipe recipe){
        if (recipes.contains(recipe)){
            throw new IllegalArgumentException("Рецепт уже существует");
        } else {
            recipes.add(recipe);
        }
    }
}
