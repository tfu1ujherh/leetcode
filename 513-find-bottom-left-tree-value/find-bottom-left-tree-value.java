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
    public int findBottomLeftValue(TreeNode root) {


        List<List<Integer>>res=new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            int curLevel=queue.size();
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<curLevel;i++){
                TreeNode curNode=queue.poll();
                list.add(curNode.val);

                if(curNode.left!=null){
                    queue.add(curNode.left);
                }
                if(curNode.right!=null){
                    queue.add(curNode.right);
                }
            }

            res.add(list);
        }
        return res.get(res.size()-1).get(0);
    }
}