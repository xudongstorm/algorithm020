package week4;

/*45. 跳跃游戏 II*/

public class Jump {

    public int jump(int[] nums) {
        if(nums==null || nums.length<=0){
            return -1;
        }
        if(nums.length==1){
            return 0;
        }
        if(nums[0]>=nums.length-1){
            return 1;
        }
        int steps=0, position=nums.length-1;
        while(position>0){
            for(int i=0; i<position; i++){
                if(nums[i]+i>=position){
                    steps++;
                    position=i;
                }
            }
        }
        return steps;
    }
}
