public class Random {
    public static void main(String[] args) {
        System.out.println(inviteCode());
        System.out.println(inviteCode());
        System.out.println(inviteCode());
        System.out.println(inviteCode());
        System.out.println(inviteCode());
    }

    public static String inviteCode() {
        java.util.Random rnd = new java.util.Random();
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 8; i++) {
            if (rnd.nextBoolean()) {
                char c = (char) ((rnd.nextInt(26)) + 65);
                buf.append(c);
            } else {
                buf.append((rnd.nextInt(10)));
            }
        }
        return buf.toString();
    }
}
