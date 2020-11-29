package secondweek;

/*242. 有效的字母异位词*/

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {

    public static void main(String[] args) {
        System.out.println(new IsAnagram().isAnagram("aacc", "ccac"));
    }

    public boolean isAnagram(String s, String t) {
        if(s==null || t==null){
            return s==null && t==null;
        }
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            int cur = map.getOrDefault(c,-1);
            if(cur<=0){
                return false;
            }
            map.put(c, cur--);
        }
        return true;
    }

}
