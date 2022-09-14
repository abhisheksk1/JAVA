import java.util.Arrays;
public class SortedSequence {
    public static void main(String[] args) {
        String s="abzd";
        System.out.println(sort(s));
    }

    static int sort(String s)
    {
        int mn = -2147483648;
        int []dp = new int[30];
        Arrays.fill(dp, 0);
        int N = s.length();
        int lis = mn;
        for(int i = 0; i < N; i++)
        {
            int val =  (int)s.charAt(i) - 97;
            int curr = 0;
            for(int j = 0; j < val; j++)
            {
                curr = Math.max(curr, dp[j]);
            }
            curr++;
            lis = Math.max(lis, curr);
            dp[val] = Math.max(dp[val], curr);
        }

        return lis;
    }
}
