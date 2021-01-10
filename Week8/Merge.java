package week08;

/*56. 合并区间*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge {

    public int[][] merge(int[][] intervals) {
        if(intervals==null || intervals.length==0 || intervals[0].length==0){
            return new int[0][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0]-interval2[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            int left=intervals[i][0], right=intervals[i][1];
            if(list.isEmpty() || list.get(list.size()-1)[1]<left){
                list.add(new int[]{left, right});
            }else{
                list.get(list.size()-1)[1] = Math.max(right, list.get(list.size()-1)[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
