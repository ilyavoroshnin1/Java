package lesson20;

public class Main {

    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();

        holodilnik.putProduct("Яблоко", 2);
        holodilnik.putProduct("Груша", 2);
        holodilnik.putProduct("Киви", 3);
        holodilnik.putProduct("Сливки", 1);
        holodilnik.putProduct("Сахар", 6);
        holodilnik.putProduct("Яблоко", 4);

        holodilnik.printAllProducts2();

        System.out.println();

        Recept recept = new Recept("Фруктовый салат");
        recept.addIngridient("Яблоко", 1);
        recept.addIngridient("Груша", 1);
        recept.addIngridient("Сливки", 2);
        recept.addIngridient("Сахар", 1);

        holodilnik.canCook(recept);



//        holodilnik.getProduct("Бананы", 8);
//        System.out.println();
//        holodilnik.getProduct("Яблоко", 2);
    }
}
