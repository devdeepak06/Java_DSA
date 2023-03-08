package Recursion;

public class ReplaceChar {
    public static String replaceChar(String s, char c1, char c2){
        if(s.length() == 0){
            return s;
        }
        String smallAns = replaceChar(s.substring(1), c1, c2);
        if(s.charAt(0) == c1){
            return c2 + smallAns;

        }else{
            return s.charAt(0) + smallAns;
        }
    }
    public static void main(String[] args) {
        String s = "abacd";
        char c1 = 'a';
        char c2 = 'x';
        System.out.println(replaceChar(s, c1, c2));
    }
}
