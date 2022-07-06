public class SplitPractice {
    public static void main(String[] args) {
        String test = "idx_100000000055,winIdx_4";
        String[] arr = test.split(",");

        String[] arr2 = arr[0].split("_");
        String memberId = arr2[1];
        System.out.println("memberId: " + memberId);

        String[] arr3 = arr[1].split("_");
        String winId = arr3[1];
        System.out.println("winId: " + winId);
    }
}
