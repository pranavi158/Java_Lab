package Lab3;
class String_StringMethods{
    public static void main(String[] args) {
        String str = "I am a proud vitian";
        
        System.out.println(str.length());

        System.out.println(str.charAt(3));

        String str2 = "Hello World!";
        System.out.println(str.equals(str2));

        char[] ch = str.toCharArray();
        System.out.println(ch[9]);

        System.out.println(str.indexOf("proud"));

        System.out.println(str.trim());

        System.out.println(str.substring(13));

        System.out.println(str.substring(7,12));

        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());

        String[] arr = str.split(" ");
        for (String i : arr){
            System.out.println(i);
        }

        System.out.println(str.replace('a','k'));

        System.out.println(str.contains("proud"));
        System.out.println(str.contains("hello"));


    }
}
