public class ReplaceSubstring {
    public static void main(String[] args) {
        String s="This is a girl";
        String o="girl";
        String n="boy";
        replaceString(s,o,n);
    }
    static void replaceString(String s, String oldStr, String newStr){
        String replace=s.replace(oldStr, newStr);
        System.out.println("New String is: "+ replace);
    }
}
