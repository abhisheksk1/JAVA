public class Automorphic {
    public static void main(String[] args) {
        helper(75);
    }
    static void helper(int n){
        //convert number into string:
        String s1=Integer.toString(n);
        int len1=s1.length();

        //calculate square of the number:
        int square=n*n;

        //convert square into string:
        String s2=Integer.toString(square);
        int len2=s2.length();

        String s3=s2.substring(len2-len1);

        if(s1.equals(s3))
            System.out.println("Automorphic Number");
        else
            System.out.println("Not a Automorphic number");
    }
}
