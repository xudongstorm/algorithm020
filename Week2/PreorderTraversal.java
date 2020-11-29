package secondweek;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*144. 二叉树的前序遍历*/

public class PreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root != null){
            LinkedList<TreeNode> stack = new LinkedList<>();
            while(root!=null || !stack.isEmpty()){
                while(root!=null){
                    result.add(root.val);
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();
                root = root.right;
            }
        }
        return result;
    }
}
