package Lesson15;

public class MultiThread { //МНОГОПОТОЧНОСТЬ
    public static void main(String[] args) {

//        MyThread myThread1 = new MyThread("Мыть посуду");
//        MyThread myThread2 = new MyThread("Чесать жопу");
//        MyThread myThread3 = new MyThread("Поправлять незаметно яйца");
//        myThread1.start(); // ".start()" - метод по одновременному(многопоточному) запуску нескольких задач
//        myThread2.start();
//        myThread3.start();                Закомментировали для того, чтобы создать новые объекты

        Thread thread1 = new Thread( new MyRunnableClass());

    }
}

// СУЩЕСТВУЕТ 3 МЕТОДА СОЗДАНИЯ МНОГОПОТОЧНОСТИ
// 2) ИСПОЛЬЗУЕМ ИНТЕРФЕЙСЫ ДЛЯ НАСЛЕДОВАНИЯ ОТ РАЗНЫХ КЛАССОВ - имплементирование интерфейса "Runnable"
// имплементирование интерфейса "Runnable" нужно для какого нибудь класса, который уже наследовался от другого родительского, но ему
// также НУЖНА МНОГОПОТОЧНОСТЬ, которая создается за счет "RUN"
    class MyRunnableClass implements Runnable{
    String task; // создаем доп поле
    public MyRunnableClass(String task) { // создаем конструктор
        this.task = task;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Задание " + task + " выполнено на " + i + "%");
        }
    }
}


// 1) ПЕРЕОПРЕДЕЛЕНИЕ метода "run" или при "СОЗДАНИИ КЛАССА" - наследование от "Thread"
class MyThread extends Thread {
    String task; // дополнительно поле создаем сами, это НАЗВАНИЕ ЗАДАЧИ, которую даем компьютеру
    public MyThread(String task) { // создали конкструктор
        this.task = task;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Задание " + task + " выполнено на " + i + "%");
        }
    }
}
