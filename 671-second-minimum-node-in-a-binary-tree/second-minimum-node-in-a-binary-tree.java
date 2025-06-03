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
    public int findSecondMinimumValue(TreeNode root) {
        List<Long> set = new ArrayList<>();
        helper(root, set);
        long ans = -1;
        int c = 0;
        Collections.sort(set);
        for(long e : set){
            if(e!=ans){
                ans = e;
                c++;
            }
            if(c==2) break;
        }
        return c>=2 ? (int)ans : -1;
    }

    public void helper(TreeNode root, List<Long> set){
        if(root==null) return;
        helper(root.left,set);
        set.add((long)root.val);
        helper(root.right, set);
    }
}
