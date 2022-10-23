package di;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ContainerService {

    // Method paramter로 넘기는 타입으로 리턴타입을 받는다.
    public static <T> T getObject(Class<T> classType){
        T instance = createInstance(classType);
        Arrays.stream(classType.getDeclaredFields()).forEach(f -> {
            // 만약에 필드에 Inject 어노테이션이 붙어있다면
            if (f.getAnnotation(Inject.class) != null) {
                // 해당 Inject가 붙은 클래스의 타입을 가져와서
                Class<?> type = f.getType();
                // 해당퇴는 타입의 인스턴스를 만든다
                Object instance1 = createInstance(type);
                f.setAccessible(true);
                try {
                    System.out.println(f.get(instance));
                    f.set(instance, instance1);
                    System.out.println(f.get(instance));
                    System.out.println(instance1.toString());
                    System.out.println(f.get(instance1));
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        return instance;
    }

    // instance를 생성하는 메소드
    private static <T> T createInstance(Class<T> classType) {
        try {
            return classType.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
