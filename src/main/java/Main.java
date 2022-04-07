public class Main {
    public static void main(String[] args) {
        System.out.println("Main.main");
        int a = 1;
        int b = 2;

//        assert a > b : "hello world";

        if ( !(a > b) ) {
            throw new RuntimeException("exception occurred");
        }

        System.out.println("this text should be unseen");
    }
}
