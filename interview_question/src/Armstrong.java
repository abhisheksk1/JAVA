public class Armstrong {
    public static void main(String[] args) {
        arm(371);
    }
    static void arm(int n){
        int num=n;
        int rem, result=0;
        while(num!=0){
            rem=num%10;
            result+=Math.pow(rem, 3);
            num=num/10;
        }
        if(result==n)
            System.out.println(n+" is a Armstrong number");
        else
            System.out.println(n+" is not a Armstrong number.");
    }
}
