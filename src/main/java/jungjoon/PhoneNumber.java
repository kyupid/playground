package jungjoon;

public class PhoneNumber {
    private int areaCode;
    private int prefix;
    private int lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
    public String toString() {
        return String.format("%03d-%03d-%04d", areaCode, prefix, lineNum);
    }

    /**
     * 이와 같이 getter 혹은 값을 반환해주는 api가 없다면 toString이 유일한 값의 탈출구?가 됩니다.
     */
    public int getAreaCode() {
        return areaCode;
    }
}
