import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int num1=sc.nextInt();

        System.out.println("Enter the 2nd number: ");
        int num2=sc.nextInt();

        int n=1;
        if(num1!=num2){
            while(n!=0){
                n=num1%num2;
                if(n!=0){
                    num1=num2;
                    num2=n;
                }
            }
            System.out.println(num2);
        }
        else{
            System.out.println("Wrong Input");
        }
    }
}
