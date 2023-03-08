package Recursion;

public class ReplacePi {
    public static String replacePi(String s){
        if(s.length() <= 1){
            return s;
        }
        if(s.charAt(0) == 'p' && s.charAt(1) == 'i'){
        String smallAns = replacePi(s.substring(2));
        return "3.14" + smallAns; 
        }else{
            String smallAns = replacePi(s.substring(1));
                return s.charAt(0) + smallAns;
            }
        }
        public static void main(String[] args) {
            String s = "pippxxppiixipi";
            System.out.println(replacePi(s));
        }
}
