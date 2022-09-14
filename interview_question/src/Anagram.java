public class Anagram {
    public static void main(String[] args) {
        String s="abhishek";
        String t="abhikehst";
        System.out.println(validAnagram(s,t));
    }
    public static boolean validAnagram(String s, String t){
        int[] arr=new int[127];

        for(char c:s.toCharArray()){
            arr[c]++;
        }
        for(char c:t.toCharArray()){
            arr[c]--;
        }

        for(int count:arr){
            if(count>0||count<0){
                return false;
            }
        }
        return true;
    }
}
