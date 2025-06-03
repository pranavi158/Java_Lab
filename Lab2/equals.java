package Lab2;

public class equals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String str1 = s1.toLowerCase();
        String str2 = s2.toLowerCase();
        if(str1.equals(str2)){
            System.out.println("Both are Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}