package secondweek;

import java.util.*;

/*347. 前 K 个高频元素*/

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        if(nums==null || nums.length<k || k<=0){
            return null;
        }
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<>() {   //小根堆
            @Override
            public int compare(int[] m, int[] n) {
                return m[0]-n[0];
            }
        });
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int[] a = new int[]{entry.getValue(), entry.getKey()};  //a[0]是出现频率，a[1]是哪个数字
            if(queue.size() < k){
                queue.offer(a);
            }else{
                if(queue.peek()[0] < a[0]){
                    queue.poll();
                    queue.offer(a);
                }
            }
        }
        for(int i=0; i<k; i++){
            result[i] = queue.poll()[1];
        }
        return result;
    }
}
