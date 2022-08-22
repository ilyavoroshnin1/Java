package Lexa15;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(12);
        } catch (UncurrentAgeExceprion e) {
            e.printStackTrace();
        }
        System.out.printf("Программа работает исправно");
    }
}
