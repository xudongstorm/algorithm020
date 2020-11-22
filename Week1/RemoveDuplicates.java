package firstweek;

/**
 * 26. 删除排序数组中的重复项
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length<= 0){
            return 0;
        }
        int j=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[j]){
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }
}
