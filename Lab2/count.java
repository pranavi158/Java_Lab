package Lab2;
class count {
    public static void main(String[] args) {
        String str = "hello HH @& 123";
        String s = str.toLowerCase();
        int vcount = 0;
        int scount = 0;
        int ncount = 0;
        int ccount = 0;
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                vcount++;
            }else if(s.charAt(i) <= '9' && s.charAt(i) >= '0'){
                ncount++;
            }else if(s.charAt(i) == '@' || s.charAt(i) == '*' || s.charAt(i) == '&' || s.charAt(i)=='^' || s.charAt(i) == '%' || s.charAt(i) == '$' || s.charAt(i) == '#'){
                scount++;
            }else{
                ccount++;
            }
    }
    System.out.println("Vowels :"+ vcount);
    System.out.println("Special Characters :"+ scount);
    System.out.println("Consonants :"+ ccount);
    System.out.println("Numbers :"+ ncount);
    }
    
}