package Hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class ProductList {
    private final Set<Product> products = new HashSet<>();

    public void addProduct(Product products) {
        if (products == null){
            return;
        }
        if (this.products.contains(products)){
            throw new IllegalArgumentException("Продукт уже есть в списке");
        }else {
            this.products.add(products);
        }
    }
    public void checkProduct(String name){
        for(Product product: this.products){
            if (product.getName().equals(name)) {
                product.setChecked();
                break;
            }
        }
    }
    public void removeProduct(String name){
        Iterator<Product> productIterator = this.products.iterator();
        while (productIterator.hasNext()){
            if (productIterator.next().getName().equals(name)){
                productIterator.remove();
                break;
            }
        }
    }

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductList that = (ProductList) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }
}
