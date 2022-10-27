package effiective.item06;

class Main {
    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";
        System.out.println(hello == "Hello");
        System.out.println(Other.hello == hello);
        System.out.println(Other.hello == hello);
        System.out.println(hello == ("Hel" + "lo"));
        System.out.println(hello == ("Hel" + lo));
        System.out.println(hello == ("Hel" + lo).intern());
        Boolean.valueOf(hello);
        hello.matches("asdasdas");
    }
}

class Other {
    static String hello = "Hello";
}
