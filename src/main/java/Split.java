import java.lang.management.ManagementFactory;
import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String test2 = "089D579257B1506340663C0A8DDA1268.tomcat1";
//        String test2 = "M4642_100000000083";
        String name = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println("name: " + name);
        System.out.println("name: " + name);
        System.out.println("name: " + name);
        System.out.println("name: " + name);
        System.out.println("name: " + name);
        System.out.println("name: " + name);


        String[] s = test2.split("_");
        if (s.length == 2) {
            String[] s2 = s[0].split("", 2);
            if (s2[0].equals("M") || s2[0].equals("S")) {
                System.out.println("미션타입이 M이거나 S임");
            } else {
                System.out.println("M이거나 S가아님");
            }
        } else {
            System.out.println("s.length가 2가아님");
        }
    }
}
