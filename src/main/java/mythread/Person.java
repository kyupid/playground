package mythread;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public synchronized void printPersonInfo(MyThread myThread) {
        try {
            wait(3000);
        } catch (Exception e) {
        }
        System.out.println(String.format("Thread = %s, Person name = %s, age = %d", myThread.getName(), getName(), getAge()));
    }

    public synchronized void printMyThread(MyThread myThread) {
        System.out.println("MyThreadName = " + myThread);
    }
}
