public class SumNaturalNo {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n==0)
            return n;

        return n+sum(n-1);
    }
}
