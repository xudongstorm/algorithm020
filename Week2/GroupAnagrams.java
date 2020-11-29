package secondweek;

import java.util.*;

/*49. 字母异位词分组*/

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs==null || strs.length<=0){
            return result;
        }
        Map<String, List<String>> map = new HashMap<>();
        int[] count = new int[26];
        for(String str : strs){
            Arrays.fill(count, 0);  //重新置位
            for(int i=0; i<str.length(); i++){
                int index = str.charAt(i)-'a';
                count[index]++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i : count){
                sb.append("#");
                sb.append(i);
            }
            String key = sb.toString();
            if(map.containsKey(key)){
                map.get(key).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
