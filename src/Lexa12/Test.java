package Lexa12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(100000);
        LinkedList<String> linked = new LinkedList<>();

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add("Я смогу!   " + i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Время выполнения add ArrayList: " + (endTime1 - startTime1));


        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linked.add("Я смогу!   " + i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Время выполнения add LinkedList: " + (endTime2 - startTime2 ));

        System.out.println();
        /////////////////////////////////////////////////////////////////////////////////////
        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            list.get(i);
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("Время выполнения get у ArrayList: " + (endTime3 - startTime3 ));

        long startTime4 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            linked.get(i);
        }
        long endTime4 = System.currentTimeMillis();
        System.out.println("Время выполнения get у LinkedList: " + (endTime4 - startTime4 ));
    }
}
