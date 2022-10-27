package jungjoon;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    List<PhoneNumber> numberList;

    public PhoneBook() {
        this.numberList = new ArrayList<>();
    }
    public void register(PhoneNumber phoneNumber) {
        numberList.add(phoneNumber);
    }

    /**
     * 객체에 getter메서드 만들어서 사용하기
     */
    public void printWithAreaCodeByGetter(int areaCode) {
        numberList.stream()
                .filter((phoneNumber) -> areaCode == phoneNumber.getAreaCode())
                .forEach(phoneNumber -> System.out.println(phoneNumber));
    }

    /**
     * toString 파싱해서 사용하기
     * 해당 메서드는 toString을 활용하는 getPrefixByUsingToString 메서드를 사용합니다.
     */
    public void printWithAreaCodeByToString(int areaCode) {
        numberList.stream()
                .filter((phoneNumber) -> areaCode == getAreaCodeByUsingToString(phoneNumber))
                .forEach(phoneNumber -> System.out.println(phoneNumber));
    }

    /**
     * PhoneNumber 객체에 가보면, 핃드들이 모두 private으로 설정되어 있는데 getter메서드가 없는 areaCode를 제외한 필드의 값을 받아올 방법이 없습니다
     * 반환된 값을 받아올 api가 없다면 다음과 같이 같이 toString()을 이용할 수 밖에 없습니다.
     * 만약, prefix 혹은 lineNum을 통해 값을 필터링하려면, 이 메서드처럼 toString()에 정해진 포맷에서 substring한 결과를 사용할 수 밖에 없습니다.
     */
    private int getAreaCodeByUsingToString(PhoneNumber phoneNumber) {
        String substring = phoneNumber.toString().substring(0, 3);
        System.out.println(substring);
        return Integer.parseInt(substring);
    }
}
