package com.abhi;

public class TripletArray {
    public static void main(String[] args) {
        int n=3;
        int[] arr={1,2,3};
        System.out.println(triplet(n,arr));
    }
    static int triplet(int n, int[] arr){
        int maxSeq = Integer.MAX_VALUE;
        int min = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            else if(arr[i] > min && arr[i] < maxSeq){
                maxSeq = arr[i];
            }
            else if(arr[i] > maxSeq){
                return 1;
            }
        }
        return 0;
    }
}
