package firstweek;

/**
 * 283. 移动零
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length<=0){
            return;
        }
        int curIndex = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[curIndex] = nums[i];
                if(curIndex != i){
                    nums[i] = 0;
                }
                curIndex++;
            }
        }
    }
}
