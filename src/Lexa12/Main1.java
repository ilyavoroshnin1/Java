package Lexa12;

import java.util.ArrayList;
import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(9);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);

        // 1 = проходс пом цикла FOR (только для тех коллекций, где есть индексы)
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
        }
        System.out.println();
        System.out.println();
        // 2 - FOR EACH (для всех коллекций)
        for (Integer num : numbers) {
            System.out.print(num);
        }
        System.out.println();
        System.out.println();
        // 3 - С ПОМОЩЬЮ ИТЕРАТТОРА (для всех коллекций)
        for (Iterator<Integer> iter = numbers.iterator(); iter.hasNext(); ){
            System.out.print(iter.next());
        }
        System.out.println();
    }
}
