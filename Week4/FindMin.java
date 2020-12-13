package week4;

/*153. 寻找旋转排序数组中的最小值*/

public class FindMin {

    public int findMin(int[] nums) {
        if(nums==null || nums.length<=0){
            return -1;
        }
        int low=0, high=nums.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]<nums[high]){
                high=mid;
            }else if(nums[mid]>nums[high]){
                low=mid+1;
            }else{
                high-=1;
            }
        }
        return nums[low];
    }
}
