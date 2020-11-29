package secondweek;

import java.util.LinkedList;
import java.util.List;

/*589. N叉树的前序遍历*/

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class preorderN {
    public List<Integer> preorder(Node root) {
        LinkedList<Integer> result = new LinkedList<>();
        if(root==null){
            return result;
        }
        LinkedList<Node> stack = new LinkedList<>();
        stack.add(root);
        while(!stack.isEmpty()){
            Node node = stack.pop();
            result.add(node.val);
            List<Node> children = node.children;
            if(children!=null && !children.isEmpty()){
                for(int i=children.size()-1; i>=0; i--){
                    stack.push(children.get(i));
                }
            }
        }
        return result;
    }
}
