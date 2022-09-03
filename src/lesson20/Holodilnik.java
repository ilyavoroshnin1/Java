package lesson20;

import java.util.HashMap;
import java.util.Map;

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
            System.out.println("Необходимого количества" + product + " Не хватает, было взято " + products.get(product)
                    + " имеющихся кг!");
            products.remove(product);
            return;
        }
        if (products.get(product) == value) {
            products.remove(product);
            return;
        }

        products.put(product, products.get(product) - value); // 6.
        System.out.println("Из хол-ка было взяты " + value + " кг " + product + " , осталось " + (products.get(product) - value)
         + " кг!");
        return;
    }

    public void printAllProducts1(){ // 7.
        for (String product : products.keySet()) {
            System.out.println(product + " - " + products.get(product));
        }
    }

    public void printAllProducts2(){ // 8.
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            System.out.println(product.getKey() + " " +product.getValue());
        }
    }
    // 9 !!!

    // 10.
    public void canCook(Recept recept){
        // products - HASHMAP в которой все продукты хол-ка
        // recept - список ингрид-в и названия

        for (String ingr : recept.getIngridients().keySet()) { // проход по ингредиентам
            if (!products.containsKey(ingr)){ // 11
                System.out.println("Такого ингредиента нет - " + ingr);
                return;
            }

            if (products.get(ingr) < recept.getIngridients().get(ingr)){ // 12
                System.out.println("Такого ингредиента не хватает - " + ingr);
                return;
            }
        }
        System.out.println(recept.getName() + " - можно приготовить! ");
    }
}






// 1 - создаем метод "положить товар в холодильник"
// 2 - проверка на уже наличие продукта в холод-ке
// 3 - если такой продукт уже есть в холод-ке, тогда "put - добавить" к "product - продукту" новое значение "value + products.get(product)"
// где "products.get(product)" - значение старое

// 4 - воскл знак значит отрицание. Если такого продукта нет в хол-ке. "containsKey(product)" метод проверяет наличие, в скобках то, что нужно проверить
// 5 - когда не хватает товара, тогда берется все, что есть, и продукт удаляется из коллекции

// 6 - ситуация, когда товара хватает на запрашиваемое кол-во. "put" только способен перезатереть кол-во

// 7 - первая реализ-я метода, чтобы пройтись по HASHMAPу и показать - что есть внутри
// 8 - вторая реализ-я. очень сложно, 1:00:00
// 9 - когда каким методом польз-ся? Первым когда нужно просто пройтись, Вторым когда нужно изменить пар-ры прохождения!!!

// 10 - пишем метод "можем ли мы приготовить..."
// 11 - вместо цикла ставим условие, что если такой-то продукт "ingr" не содержится в хол-ке "products"
// 12 - "products.get(ingr)" - количество ингид-в в хол-ке, "recept.getIngridients().get(ingr)"-нужное кол-во ингииента из рецепта