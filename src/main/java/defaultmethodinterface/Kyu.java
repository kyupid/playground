package defaultmethodinterface;

public class Kyu implements Bar {
private String a;
private int b;

    @Override
    public void print() {

        String c = null;
        int d = 0;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
