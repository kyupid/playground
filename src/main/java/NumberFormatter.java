import java.text.DecimalFormat;

public class NumberFormatter {
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.formatNumber();
        System.out.println(foo.getNumber());
    }

    static class Foo {
        private String number = "10000";

        public void formatNumber() {
            DecimalFormat formatter = new DecimalFormat("###,###");
            this.number = formatter.format(10000);
        }

        public String getNumber() {
            return number;
        }
    }
}

