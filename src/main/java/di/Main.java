package di;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {

        TestClass tc = new TestClass();

        Class<?> cls = tc.getClass();

        Field publicFields[] = cls.getFields();
        Field allFields[] = cls.getDeclaredFields();

        try {
            System.out.println("[Public Field]");
            for (Field field : publicFields) {
                String name = field.getName();
                System.out.println("field name : " + name + ", field value : " + field.get(tc));
            }
            System.out.println();

            // 에러 발생
            for (Field field : allFields) {
                field.set(tc,123);

                String name = field.getName();
                System.out.println("field name : " + name + ", field value : " + field.get(tc));
            }

        } catch (Exception e) {
            e.printStackTrace();
            try {
                System.out.println("[All Field]");
                for (Field field : allFields) {
                    // 접근해재
                    field.setAccessible(true);
                    String name = field.getName();
                    System.out.println("field name : " + name + ", field value : " + field.get(tc));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
