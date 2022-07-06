public class RandomNum {
    public static void main(String[] args) {
        String test = randomNickName();
        System.out.println(test);
    }

    static String randomNickName() {
        int randomNum = (int) (Math.random() * 1000000000);
        char randomAlphabet = (char)((int)(Math.random()*26)+65);
        return "USER" + randomNum + randomAlphabet;
    }
}
