public class ReverseNumber {
    public static void main(String[] args) {
        int num=123;
        reverse(num);
    }
    static void reverse(int num){
        int n=num;
        int rev=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            rev=rev*10 +rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}
