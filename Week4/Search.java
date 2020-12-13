package week4;

/*33. 搜索旋转排序数组*/

public class Search {

    public int search(int[] nums, int target) {
        if(nums==null || nums.length<=0){
            return -1;
        }
        if(nums.length==1){
            return nums[0]==target ? 0 : -1;
        }
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>=nums[low]){
                if(target>=nums[low] && target<=nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(target>=nums[mid] && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
