package mythread;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Date date_now = new Date(System.currentTimeMillis()); // 현재시간을 가져와 Date형으로 저장한다
// 년월일시분초 14자리 포멧
        SimpleDateFormat fourteen_format = new SimpleDateFormat("yyyyMMddHHmmss");
        System.out.println(fourteen_format.format(date_now));

        List<Integer> list = Arrays.asList(1,2,3);

//        for(Integer i : list){
//            for(int j=0; j<i; j++){
//                System.out.println(i/j);
//            }
//        }

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("짱구", 23, "010-1234-1234"));
        personList.add(new Person("유리", 24, "010-2341-2341"));
        personList.add(new Person("맹구", 23, "010-3412-3412"));

        personList.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(p -> System.out.println(p.getName()));
    }
}
