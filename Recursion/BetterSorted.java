package Recursion;

public class BetterSorted {
    public static boolean isSortedBetter(int a[], int si){
        if(si == a.length - 1){
            return true;
        }
        if(a[si] > a[si + 1]){
            return false;
        }
        boolean smallAns = isSortedBetter(a, si + 1);
        return smallAns;

    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSortedBetter(arr, 0));
    }
}
