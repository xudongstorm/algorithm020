package firstweek;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 42. 接雨水
 */
public class Trap {

    public int trap(int[] height) {
        if(height==null || height.length<=1){
            return 0;
        }
        int result = 0;
        Deque<Integer> stack = new LinkedList<>();
        for(int i=0; i<height.length; i++){
            while(!stack.isEmpty() && height[i]>height[stack.peek()]){
                int top = stack.pop();
                if(stack.isEmpty()){
                    break;
                }
                int distance = i - stack.peek() - 1;
                int bounded_height = Math.min(height[i], height[stack.peek()]) - height[top];
                result += distance * bounded_height;
            }
            stack.push(i);
        }
        return result;
    }
}
