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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        int max=Integer.MIN_VALUE;
        int level=0;
        int count=0;
        while(!queue.isEmpty()){
            count++;
            int sum=0;
            int curLevel=queue.size();
            for(int i=0;i<curLevel;i++){
                TreeNode curNode=queue.peek();
                if(curNode.left!=null){
                    queue.add(curNode.left);
                }
                if(curNode.right!=null){
                    queue.add(curNode.right);
                }
                sum+=queue.poll().val;
            }
            if(sum>max){
                max=sum;
                level=count;
            }
        }

        return level;
        
    }
}