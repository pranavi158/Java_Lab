package Lab2;

public class occur {
    public static void main(String[] args) {
        String str = "Hello World";
        char s1 = 'o';

        System.out.println("First Occurance : " + str.indexOf(s1));
        System.out.println("Last Occurance : " + str.lastIndexOf(s1));
    }
}