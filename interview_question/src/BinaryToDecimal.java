import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        int binary = sc.nextInt();

        int decimal = 0;
        //Declare a variable to use in power
        int n=0;
        while(binary>0){
            int temp=binary%10;
            decimal += temp*Math.pow(2,n);
            binary /= 10;
            n++;
        }
        System.out.println("Decimal no is: "+decimal);
    }
}
