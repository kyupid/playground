package effective;

import java.util.Collection;

class Main {
    public static void main(String[] args) {
        Object[] obj = {"hello", "world"};

        String[] attributes = (String[]) obj;

        Object hello = "hello";
        String attribute = (String) hello;
    }
}

class NestedNonStaticExample {

    private final String name;

    public NestedNonStaticExample(String name) {
        this.name = name;
    }

    public String getName() {
        // 비정적 멤버 클래스와 바깥 클래스의 관계가 확립되는 부분
        NonStaticClass nonStaticClass = new NonStaticClass("nonStatic : ");
        return nonStaticClass.getNameWithOuter();
    }

    public String getA() {
        return "A";
    }

    private class NonStaticClass {
        private final String nonStaticName;

        public NonStaticClass(String nonStaticName) {
            this.nonStaticName = nonStaticName;
        }

        public String getNameWithOuter() {
            return nonStaticName + NestedNonStaticExample.this.getA();
        }
    }
}
