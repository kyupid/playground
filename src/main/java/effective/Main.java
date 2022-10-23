package effective;

public class Main {

    @Override
    protected void finalize() throws Throwable {
        // 구현
        System.out.println("finalize 호출");
    }
}
