package Lab2;

public class password {
    public static void main(String[] args) {
        String name = "Pranavi";
        int rollno = 7188;

        String s1 = name.substring(0,4);
        String s2 = String.valueOf(rollno);
        String s21 = s2.substring(2,4);
        String pass = s1+s21;
        System.out.println("Password : "+pass);
    }
}