package mythread;

public class MyThread extends Thread{

    private final Person person;
    private final int status;

    public MyThread(Person person, int status) {
        this.person = person;
        this.status = status;
    }

//    @Override
//    public void run() {
//        if (status == 0) {
//            person.printPersonInfo(this);
//        } else if (status == 1) {
//            person.printMyThread(this);
//        }
//    }
}
