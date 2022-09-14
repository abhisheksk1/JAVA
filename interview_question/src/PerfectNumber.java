import java.util.Enumeration;

public class PerfectNumber {
    public static void main(String[] args) {
        perfect(28);
    }
    static void perfect(int n){
        int sum=0;
        for(int i=1; i<n; i++) {
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
    }
}
