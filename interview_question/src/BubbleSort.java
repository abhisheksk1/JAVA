public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={2,4,3,9,6,5};
        bubble(arr);
        printArray(arr);
    }
    static void bubble(int[] arr){
        int l=arr.length;
        for(int i=0; i<l-1; i++){
            for(int j=1; j<l-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void printArray(int a[])
    {
        int len = a.length;
        for (int i = 0; i < len; i++)
            System.out.print(a[i] + " "); //printing the sorted array

        System.out.println();
    }
}
