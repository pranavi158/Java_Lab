package Lab2;

public class palindrome {
    public static void main(String[] args){
        String str = "abbaa";
        String str1 = str.toLowerCase();
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str1.charAt(left) != str1.charAt(right)){
                System.out.println("Not Palindrome");
                return;
            }
            left++;
            right--;
        }
            System.out.println("Palindrome");
    }
}

