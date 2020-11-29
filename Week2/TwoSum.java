package secondweek;

import java.util.HashMap;
import java.util.Map;
/*1. 两数之和*/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        if(nums==null || nums.length<2){
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            int other = target-nums[i];
            if(map.get(other) != null){
                result[0] = map.get(other);
                result[1] = i;
            }else{
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
