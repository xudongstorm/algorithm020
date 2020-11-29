package secondweek;

/*剑指 Offer 49. 丑数*/

public class NthUglyNumber {

    public int nthUglyNumber(int n) {
        if(n<0){
            return 0;
        }
        int x=0,y=0,z=0;
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i=1; i<n; i++){
            int a=dp[x]*2, b=dp[y]*3, c=dp[z]*5;
            dp[i] = Math.min(a, Math.min(b,c));
            if(dp[i]==a){
                x++;
            }
            if(dp[i]==b){
                y++;
            }
            if(dp[i]==c){
                z++;
            }
        }
        return dp[n-1];
    }
}
