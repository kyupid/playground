package effective;

import java.time.format.TextStyle;
import java.util.Map;

class Envelope {
    void x() {

        class Test {
            private String testName;

            private void printtest() {
                System.out.println("hello local class");
            }
        }


        new Test().printtest();
        System.out.println("Hello");
    }
    class Enclosure {
        void x() {
            x(); /* Qualified*/
        }
    }
}
