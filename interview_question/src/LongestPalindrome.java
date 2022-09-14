public class LongestPalindrome {
    public static void main(String[] args) {
        int[] arr={121, 1221, 1231, 12221, 112};
        int n=5;
        System.out.println(largestPalindrome(arr, n));
    }
    static boolean isPalindrome(int n){
        int num=n;
        int rev=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==num)
            return true;
        else
            return false;
    }
    static int largestPalindrome(int[] arr, int n){
        int res=-1;
        for(int i=0; i<n; i++){
            if(arr[i]>res && isPalindrome(arr[i])){
                res=arr[i];
            }
        }
        return res;
    }
}
