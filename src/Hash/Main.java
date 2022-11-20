package Hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {

    public void main(String[] args){
        Product banan = new Product("банан",60.5,2);
        Product milk = new Product("Молоко",40.5,2);
        Product banan1 = new Product("банан",60.5,2);

        ProductList productList = new ProductList();
        System.out.println(productList.addProduct(banan));
        numbersSetRemoveEven();
    }
    public static void numbersSetRemoveEven(){
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20){
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()){
            int number = numberIterator.next();
            if(number % 2 != 0){
                numberIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
