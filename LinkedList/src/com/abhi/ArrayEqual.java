package com.abhi;
import java.util.*;

public class ArrayEqual {
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);



        return false;
    }
    public static void main(String[] args) {
        long A[]={8, 9, 7, 5, 3, 1};
        long B[]={5, 4, 2, 5, 1, 7};
        int N=6;
        System.out.println(check(A,B,N));
    }
}
