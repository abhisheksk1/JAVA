public class PalindromeString {
    public static void main(String[] args) {
        String s="aaaaa";
        System.out.println(palin(s));
    }
    static boolean palindrome(String s){
        StringBuilder sb=new StringBuilder(s);

        StringBuilder strRev=sb.reverse();
        if(s.equals(String.valueOf(strRev)))
            return true;
        else
            return false;
    }

    static boolean palin(String s){
        String rev="";
        for(int i=s.length()-1; i>=0; i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev))
            return true;
        else
            return false;
    }
}
