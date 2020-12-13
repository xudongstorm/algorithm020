package week4;

import java.util.Arrays;

/*
455. 分发饼干
*/

public class FindContentChildren {

    public int findContentChildren(int[] g, int[] s) {
        if(g==null || s==null || g.length<=0 || s.length<=0){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0, result=0;
        for(int i=0; i<s.length; i++){
            if(j<g.length && s[i]>=g[j]){   //满足孩子的胃口
                j++;
                result++;
            }
        }
        return result;
    }
}
