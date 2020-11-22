package firstweek;

import java.util.HashMap;

/**
 * 1. 两数之和
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        if(nums==null || nums.length<=1){
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = null;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                result = new int[2];
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                return result;
            }else{
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
