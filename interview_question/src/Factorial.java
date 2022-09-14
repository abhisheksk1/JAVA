public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
    static int factorial(int n){
        if(n<0){
            return 0;
        }
        int fact=1;
        for(int i=n; i>=1; i--){
            fact=fact*i;
        }
        return fact;
    }
}
