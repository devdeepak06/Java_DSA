//Last index of a number in an array using recursion

package Recursion;

public class LastIndex {    
    public static int lastIndex(int input[], int x) {
        if(input.length == 0){
            return -1;
        }
        int smallArray[] = new int[input.length - 1];
        for(int i = 1; i < input.length; i++){
            smallArray[i - 1] = input[i];
        }
        int smallAns = lastIndex(smallArray, x);
        if(smallAns != -1){
            return smallAns + 1;
        }else{
            if(input[0] == x){
                return 0;
            }else{
                return -1;
            }
        }
        

    //     return lastIndex(input, x, input.length - 1);
    // }
    // public static int lastIndex(int input[], int x, int si){
    //     if(si == -1){
    //         return -1;
    //     }
    //     if(input[si] == x){
    //         return si;
    //     }
    //     int smallAns = lastIndex(input, x, si - 1);
    //     return smallAns;


    }
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 10, 7};
        int x = 7;
        System.out.println(lastIndex(arr, x));
    }
}
