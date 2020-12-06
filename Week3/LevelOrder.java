package threeweek;

import java.util.*;

/*102. 二叉树的层序遍历*/

public class LevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        result.add(Collections.singletonList(root.val));
        while (!queue.isEmpty()){
            int curLevelSize = queue.size();    //当前层的节点数
            List<Integer> levelNode = new ArrayList<>();
            while (curLevelSize>0){
                TreeNode node = queue.poll();
                if(node.left != null || node.right != null){
                    if(node.left != null){
                        queue.offer(node.left);
                        levelNode.add(node.left.val);
                    }
                    if(node.right != null){
                        queue.offer(node.right);
                        levelNode.add(node.right.val);
                    }
                }
                curLevelSize--;
            }
            if(!levelNode.isEmpty()){
                result.add(levelNode);
            }
        }
        return result;
    }
}
