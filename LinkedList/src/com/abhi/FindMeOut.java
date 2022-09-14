package com.abhi;

public class FindMeOut {
    public static void main(String[] args) {
        int n=10;
        System.out.println(helper(n));
    }
    public static int helper (int input1) {
        int res = 0;
        for (int i = input1; i < 10000; i++) {
            if (getSum(i) == input1 && i % input1 == 0 && i!=input1) {
                res = i;
                break;
            }
        }
        return res;
    }

    static int getSum (int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n/10;
        }
        return sum;
    }
}
