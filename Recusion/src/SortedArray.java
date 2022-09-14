public class SortedArray {
    public static void main(String[] args) {
        int[] arr={1,8,4,3,8,10};
        System.out.println(Sorted(arr, 0));
    }
    static boolean Sorted(int[] arr, int idx){
        if(idx==arr.length-1)
            return true;

        return arr[idx]<arr[idx+1] && Sorted(arr, idx+1);
    }
}
