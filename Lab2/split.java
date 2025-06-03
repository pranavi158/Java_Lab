package Lab2;

public class split {
    public static void main(String[] args) {
        String str = "Hello World Java How Are You?";
        String[] s1 = str.split(" ");

        for(int i = 0;i<s1.length;i++){
            System.out.println(s1[i]);
        }
    }
}