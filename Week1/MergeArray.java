package firstweek;

/**
 * 88. 合并两个有序数组
 */
public class MergeArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m<=0 && n<=0){
            return;
        }
        if(m<=0){
            for(int i=0; i<nums2.length; i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        int[] result = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                result[k++] = nums1[i++];
            }else{
                result[k++] = nums2[j++];
            }
        }
        while(i<m){
            result[k++] = nums1[i++];
        }
        while(j<n){
            result[k++] = nums2[j++];
        }
        for(int l=0; l<result.length; l++){
            nums1[l] = result[l];
        }
    }
}
