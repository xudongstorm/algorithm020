package week4;

/*55. 跳跃游戏*/

public class CanJump {

    public boolean canJump(int[] nums) {
        if(nums==null || nums.length<=0){
            return false;
        }
        if(nums.length==1){
            return true;
        }
        int[] a = new int[nums.length];
        int nearest = nums.length-1;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]+i>=nums.length-1 || nums[i]+i>=nearest){
                a[i]=1;
                nearest=i;
            }
        }
        return a[0]==1;
    }
}
