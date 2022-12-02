package HW1_2_product_list;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ServiceProduct {

    private final Set<Product> products = new HashSet<>();


    public void add(Product product) {
        if (product == null) {
            return;
        }
        if (this.products.contains(product)) {
            throw new RuntimeException("Продукт уже куплен");
        } else {
            this.products.add(product);
        }
    }

    public void checkProductList(Product products) {
        for (Product product : this.products) {
            if (product.getNameProduct().equals(product)) {
                product.isBuy();
                break;
            }
        }
    }

    public void deleteProduct(String name) {
        Iterator<Product> productIterator = this.products.iterator();
        while (productIterator.hasNext()) {
            if (productIterator.next().getNameProduct().equals(name)) {
                productIterator.remove();
                break;
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список - ").append('\n');
        for (Product product : this.products) {
            stringBuilder.append(product).append('\n');
        }
        return stringBuilder.toString();
    }
}
