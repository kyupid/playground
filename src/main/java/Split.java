import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String test = "M4642_100000000083";
        String[] s = test.split("_");
        System.out.println(Arrays.toString(s));

        String[] split1 = s[0].split("", 2);
        System.out.println(Arrays.toString(split1));
    }
}
