import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int k=3;
//        rotate(arr, k);
//        System.out.println(Arrays.toString(arr));
        rotateBrute(arr, k);
    }

    static void rotate(int[] arr, int k){
        k=k% arr.length;

        //1st rotation
        reverse(arr, 0, arr.length-k-1);
        //2nd rotation
        reverse(arr, arr.length-k, arr.length-1);
        //all rotation
        reverse(arr, 0, arr.length-1);
    }
    private static void reverse(int[] arr, int start, int end){
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    //Brute Force Approach
    static int[] rotateBrute(int[] arr, int k){
        for(int i=0; i<k; i++){
            for(int j=arr.length-1; j>0; j--){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
            printArray(arr);
        }
        return arr;
    }
    static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
