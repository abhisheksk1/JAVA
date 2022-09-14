public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String str="abhiabhipandey";
        nonRepeating(str);
    }
    static void nonRepeating(String s){
        int[] arr=new int[127];

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)]++;
        }

        for(int i=0; i< arr.length; i++){
            if(arr[i]==1){
                System.out.print((char) i + " ");
            }
        }
    }
}
