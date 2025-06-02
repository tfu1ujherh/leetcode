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
    public List<Integer> rightSideView(TreeNode root) {

        

        List<Integer>res=new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList<>();
        if(root==null){
            return res;
        }

        queue.offer(root);

        while(!queue.isEmpty()){
            int curLevel=queue.size();
            for(int i=0;i<curLevel;i++){
                TreeNode curNode=queue.poll();

                if(curLevel-1==i){
                    res.add(curNode.val);
                }

                if(curNode.left!=null){
                    queue.offer(curNode.left);
                }
                if(curNode.right!=null){
                    queue.offer(curNode.right);
                }
            }
        }

        return res;
        
    }
}