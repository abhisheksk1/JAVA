public class FibonacciSeries {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fiboRecursion(n));
    }
    static void fibo(int n) {
        int first=0, second=1;
        System.out.print(first+","+second+",");
        int next;
        for(int i=2; i<n; i++){
            next=first+second;
            first=second;
            second=next;
            System.out.print(next+",");
        }
    }

    static int fiboRecursion(int n){
        if(n<=1)
            return n;

        return fiboRecursion(n-1)+fiboRecursion(n-2);
    }

}
