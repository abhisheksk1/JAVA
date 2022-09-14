import java.util.Arrays;

public class RankArray {
    public static void main(String[] args) {
        // Given array arr[]
        int[] arr = { 100, 2, 70};
        changeArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changeArray(int [] arr){
        int[] newArr= Arrays.copyOfRange(arr, 0, arr.length);

        Arrays.sort(newArr);
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length; j++){
                if(newArr[j]==arr[i]){
                    arr[i]=j+1;
                    break;
                }
            }
        }
    }
}
