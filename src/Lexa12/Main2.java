package Lexa12;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main2 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>(); // автоматом убирает дубляж!
        set.add("FATHER");
        set.add("Pupka");
        set.add("Mother");
        set.add("Pupka");

        set.add("Zalupa");
        set.add("Zalupa");

        System.out.println(set);
    }
}
