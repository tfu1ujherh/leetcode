/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        Stack<TreeNode>stack=new Stack<>();
        TreeNode curNode=root;
        while(curNode!=null || !stack.isEmpty()){

            while(curNode!=null){
            stack.push(curNode);
            curNode=curNode.left;
            }
        
        curNode=stack.pop();
        res.add(curNode.val);
        curNode=curNode.right;
    }
    return res;
    }

    
}