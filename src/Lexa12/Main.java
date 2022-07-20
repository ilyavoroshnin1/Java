package Lexa12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(9);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(7);
        numbers.add(2,777);
        numbers.set(2,999);

        System.out.println(numbers);
    }
}
