package mythread;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("kyu", 30);
        MyThread mt = new MyThread(p, 0);
        MyThread mt2 = new MyThread(p, 1);

        mt.start();
        mt2.start();
    }
}
