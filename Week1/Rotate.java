package firstweek;

/**
 * 189. 旋转数组
 */
public class Rotate {

    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length <= 0 || k<=0){
            return;
        }
        int length = nums.length;
        k %= length;
        if(k == 0){
            return;
        }
        reseva(nums, 0, length-1);
        reseva(nums, 0, k-1);
        reseva(nums, k, length-1);
    }

    public void reseva(int[] a, int start, int end){
        int temp = 0;
        while(start < end){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
