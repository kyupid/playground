public class RandomNum {

    private String a;
    private int b;

    public static void main(String[] args) {
        String test = randomNickName();
        System.out.println(test);
        String c;
        int d;

    }

    static String randomNickName() {
        int randomNum = (int) (Math.random() * 1000000000);
        char randomAlphabet = (char)((int)(Math.random()*26)+65);
        return "USER" + randomNum + randomAlphabet;
    }
}
