public class CountZeroes {
    public static void main(String[] args) {
        int n=10002;
        int count=0;
        int ans=Zeroes(n,count);
        System.out.println(ans);
    }
    static int Zeroes(int n, int count){
        if(n==0){
            return count;
        }
        int rem=n%10;
        if(rem==0){
            return Zeroes(n/10, count+1);
        }
        return Zeroes(n/10, count);
    }
}
