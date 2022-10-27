package effiective;

import java.util.function.UnaryOperator;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        UnaryOperator<Integer> unaryOperator1 = n -> n * n;
        Integer result = unaryOperator1.apply(10);
        System.out.println(result);

        UnaryOperator<Boolean> unaryOperator2 = b -> !b;
        Boolean result2 = unaryOperator2.apply(true);
        System.out.println(result2);
    }
}
