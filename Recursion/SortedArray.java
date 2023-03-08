package Recursion;

public class SortedArray {
    public static boolean isSorted(int[] a){
        if(a.length == 1){
            return true;
        }
        if(a[0] > a[1]){
            return false;
        }
        int[] smallArray = new int[a.length - 1];
        for(int i = 1; i < a.length; i++){
            smallArray[i - 1] = a[i];

        }
        boolean smallAns = isSorted(smallArray);
        return smallAns;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 6, 7, 5};
        System.out.println(isSorted(a));
    }
}
