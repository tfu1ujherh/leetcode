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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer>res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Stack<TreeNode>stack=new Stack<>();
        TreeNode curNode=root;
        stack.push(curNode);
        while(!stack.isEmpty()){
            curNode=stack.pop();
            res.add(curNode.val);
            if(curNode.right!=null){
                stack.push(curNode.right);
            }
            if(curNode.left!=null){
                stack.push(curNode.left);
            }
        }

        return res;
        
    }
}