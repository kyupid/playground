package jungjoon;

public class Main {
    public static void main(String[] args) {
        int areaCode = 32;
        int prefix = 0;
        int lineNum = 0;


        // 맨 앞 3자리(areaCode)가 적당히 겹치는 100개의 전화번호를 생성합니다.
        PhoneBook phoneBook = new PhoneBook();
        for (int i = 0; i < 100; i++) {
            phoneBook.register(new PhoneNumber(areaCode+(i % 10), prefix + i, lineNum + i));
        }

        // phoneBook.printList();

        System.out.println("======API=====");
        phoneBook.printWithAreaCodeByGetter(areaCode);

        System.out.println();
        System.out.println("======toString=====");
        phoneBook.printWithAreaCodeByToString(areaCode);


        // 출력 결과는 동일합니다. 032가 앞자리인 번호만 출력됩니다.
    }
}
