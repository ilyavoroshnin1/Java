package Lesson4;

public class Main1 {
    public static void main(String[] args) {

        // массив создается так: указывается тип \"INT"/, далее ставятся двойные квадратные скобки двухмерного массива \"[][]"/,
        // далее указываем имя \"NUMBERS"/ для примера, после знак равенства \" = "/,
        // далее у нас есть два варианта: либо сразу заполнить информацией, либо создаем его пустым, в котором будут нолики
        // нас устраивает здесь второй вариант, потому пишем \"NEW INT/
        // а далее \"[кол-во строк][кол-во колонок] "/

        // "пустой" значит то, что в ячейках нолики!!!

        int [][] numbers = new int[3][4];

        // ниже указано то, чтобы я делал, не зная цикла FOR

//        System.out.print(numbers[0][0] + " "); // выводим первую ячейку "numbers" по индексу "[0][0]"
//        System.out.print(numbers[0][1] + " "); // двигаемся вдоль строки и прописываем [0][1]
//        System.out.print(numbers[0][2] + " "); //при этом мы указываем "print" а не "println". Это для того, чтобы вывод продолжался на этой же строке. ведь мы рассматриваем едуную строку!!!
//        System.out.print(numbers[0][3] + " "); // также везде добавляем отступ \+ " "/, чтобы цифры не слипались. доходим строку до конца
//        System.out.println(); // для норм перехода на след строки, внутри ничего не пишем, чтобы был отступ
//
//        System.out.print(numbers[1][0] + " "); // далее переходим на новую строку, меняются теперь только колонки
//        System.out.print(numbers[1][1] + " ");
//        System.out.print(numbers[1][2] + " ");
//        System.out.print(numbers[1][3] + " ");
//        System.out.println();
//
//        System.out.print(numbers[2][0] + " "); // следующая строка
//        System.out.print(numbers[2][1] + " ");
//        System.out.print(numbers[2][2] + " ");
//        System.out.print(numbers[2][3] + " ");
//        System.out.println();

        // это работает, но нужно сократить, потому что может быть 1000*1000
        // все строки одинаковые, меняются только два числа
        // потому меняем цифру строки на "i", а цифру столбика на "j"
        // но вместо кол-ва строк (их тут 3: 0,1,2) ставим \"numbers.length"/
        // колонки: чтобы узнать их кол-во, нужно узнать длину этажа! берется ссылка на этаж, это \numbers по индексу [i] .length/


        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
