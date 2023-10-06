public class Main {
    public static void main(String[] args) {

        String name = "Konrad";
        int length = name.length();
        String biggerName = name.toUpperCase();
        String text = "    Jak nauczyć się programowania    ";
        String text2 = text.replace(" ", "-");
        String text3 = text.strip();
        boolean startsWithK = name.startsWith("K");

        System.out.println(name);
        System.out.println(length);
        System.out.println(biggerName);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(startsWithK);
    }
}