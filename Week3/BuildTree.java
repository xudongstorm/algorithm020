package threeweek;

/*105. 从前序与中序遍历序列构造二叉树*/

import java.util.HashMap;
import java.util.Map;

public class BuildTree {
    private Map<Integer, Integer> indexForInOrder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null || preorder.length != inorder.length){
            return null;
        }
        indexForInOrder = new HashMap<>();
        for(int i=0; i<preorder.length; i++){
            indexForInOrder.put(inorder[i], i);
        }
        return buildTree(preorder, 0, preorder.length-1, 0);
    }

    public TreeNode buildTree(int[] preorder, int preL, int preR, int inL) {
        if(preL > preR){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preL]);
        int inIndex = indexForInOrder.get(root.val);
        int leftTreeSize = inIndex-inL;
        root.left = buildTree(preorder, preL+1, preL+leftTreeSize, inL);
        root.right = buildTree(preorder, preL+leftTreeSize+1, preR, inL+leftTreeSize+1);
        return root;
    }
}
