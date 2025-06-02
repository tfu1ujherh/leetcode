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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode>queue=new LinkedList<>();
        List<Long>list=new ArrayList<>();

        queue.add(root);
        while(!queue.isEmpty()){
            int curLevel=queue.size();
            
            long sum=0;
            for(int i=0;i<curLevel;i++){
                TreeNode curNode=queue.poll();
                sum+=curNode.val;
                if(curNode.left!=null){
                    queue.add(curNode.left);
                }
                if(curNode.right!=null){
                    queue.add(curNode.right);
                }
            }
            list.add(sum);
        }
        Collections.sort(list);
        if(k>list.size()){
            return -1;
        }
        return list.get(list.size()-k);
    }
}