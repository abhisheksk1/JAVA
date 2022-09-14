public class PrintNto1 {
    public static void main(String[] args) {
        Print(5);
    }
    public static void Print(int n){
        if(n==0) {
            return ;
        }
        System.out.println(n);
        Print(n-1);
    }
}
