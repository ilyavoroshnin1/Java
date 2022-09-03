package lesson20;

public class Main1 {
    public static void main(String[] args) {
        MultiMapImpt<String, String> phoneBook = new MultiMapImpt<>();

        phoneBook.put("Слава", "+79825842569");
        phoneBook.put("Слава", "+4953615855");
        phoneBook.put("Слава", "+33333");
        phoneBook.put("Петя", "+98582224477");


    }
}
