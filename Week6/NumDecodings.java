package week06;

/*91. 解码方法*/

public class NumDecodings {

    public int numDecodings(String s) {
        if(s==null || s.length()==0){
            return 0;
        }
        if (s.charAt(0) == '0'){
            return 0;
        }
        int length=s.length();
        char[] cc = s.toCharArray();
        int pre = 1, curr = 1;  //dp[-1] = dp[0] = 1
        for (int i = 1; i < length; i++) {
            int tmp = curr;
            if (cc[i] == '0'){
                if (cc[i - 1] == '1' || cc[i - 1] == '2'){
                    curr = pre;
                }else{
                    return 0;
                }
            }else if (cc[i - 1] == '1' || (cc[i - 1] == '2' && cc[i] >= '1' && cc[i] <= '6')){
                curr = curr + pre;
            }
            pre = tmp;
        }
        return curr;
    }
}
