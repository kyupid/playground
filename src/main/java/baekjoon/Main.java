package baekjoon;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;
        for (int i = 0; i < 3; i++) {
            int temp = sc.nextInt();
            num *= temp;
        }
        int[] digits = Stream.of(String.valueOf(num).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 1; i <= 9; i++) {
            int count = 0;
            System.out.println(count);
        }
    }
}
