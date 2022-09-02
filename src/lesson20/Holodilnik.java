package lesson20;

import java.util.HashMap;

public class Holodilnik {

    private HashMap<String, Integer> products = new HashMap<>();


    public void putProduct(String product, int value){ // 1

        // 2.
        if (products.containsKey(product)){
            products.put(product, value + products.get(product)); // 3.
        } else {
            products.put(product, value);
        }
    }

    public void getProduct(String product, int value){
        if (!products.containsKey(product)){ // 4.
            System.out.println(product + "  нет в холодльнике! ");
            return;
        }
        if (products.get(product) < value){ // 5.
            System.out.println(product + " Не хватает! ");
            products.remove(product);
            return;
        }

    }
}






// 1. - создаем метод "положить товар в холодильник"
// 2 - проверка на уже наличие продукта в холод-ке
// 3. - если такой продукт уже есть в холод-ке, тогда "put - добавить" к "product - продукту" новое значение "value + products.get(product)"
// где "products.get(product)" - значение старое

// 4 - воскл знак значит отрицание. Если такого продукта нет в хол-ке. "containsKey(product)" метод проверяет наличие, в скобках то, что нужно проверить
