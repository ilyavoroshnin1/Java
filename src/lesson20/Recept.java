package lesson20;

import java.util.HashMap;

public class Recept {
    private String name; // название рецепта
    private HashMap<String, Integer> ingridients = new HashMap<>();

    public Recept(String name) { // конструктор по добавл имени рецепта
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Integer> getIngridients() {
        return ingridients;
    }

    public void setIngridients(HashMap<String, Integer> ingridients) {
        this.ingridients = ingridients;
    }

    public void addIngridient(String ingridient, int value){

        if (ingridients.containsKey(ingridient)){
            ingridients.put(ingridient, value + ingridients.get(ingridient));
        } else {
            ingridients.put(ingridient, value);
        }
    }
}
