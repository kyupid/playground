class NextAlph {
    public static String nextAlphabet(String source) {
        int length = source.length();
        char lastChar = source.charAt(length - 1);
        if (lastChar == 'Z') {
            if (length == 1) {
                return "AA";
            }
            source = nextAlphabet(source.substring(0, length - 1));
            source += "A";
            return source;
        }
        return source.substring(0, length - 1) + (char) (lastChar + 1);
    }

    public static void main(String[] args) {
        String source = "ZZ";
        source = nextAlphabet(source);
        System.out.println(source);
        System.out.println(source);
        System.out.println(source);
        System.out.println(source);
        System.out.println(source);
    }

}
