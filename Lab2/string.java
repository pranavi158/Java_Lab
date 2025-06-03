package Lab2;

public class string {
    public static void main(String[] args) {
        String str = "Hello World How Are You?";
        String s1 = "Hello";
        boolean h1 = str.startsWith(s1);
        boolean h2 = str.endsWith(s1);
        System.out.println("Starts with? "+h1);
        System.out.println("Ends with? "+h2);
    }
}