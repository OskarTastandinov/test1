package HW1_2_product_list;

public class Main {
    public static void main(String[] args) {

        Product milk = new Product("Молоко", 63, 1);
        Product kefir = new Product("Кефир", 50, 1);
        Product apple = new Product("Яблоки", 105, 1);
        Product tomatoes = new Product("Помидоры", 150, 1);
        Product strawberry = new Product("Клубника", 200, 1);
        Product cucumbers = new Product("Огурцы", 70, 1);

        ServiceProduct serviceProduct = new ServiceProduct();
        serviceProduct.add(milk);
        serviceProduct.add(kefir);
        serviceProduct.add(apple);
        serviceProduct.add(tomatoes);
        serviceProduct.add(strawberry);
        serviceProduct.add(cucumbers);
        System.out.println(serviceProduct);

        serviceProduct.checkProductList(new Product("Сыр", 500, 1));
        serviceProduct.deleteProduct("Молоко");
    }
}
