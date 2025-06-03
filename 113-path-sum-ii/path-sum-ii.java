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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> res=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        solve(root,targetSum,res,list);
        return res;
        
    }

    public static void solve(TreeNode root ,int target,List<List<Integer>>res,List<Integer>list){
        if(root==null){
            return;
        }
        list.add(root.val);
        if(target==root.val && root.left==null && root.right==null){
            res.add(new ArrayList<>(list));
        }else{
            solve(root.left,target-root.val,res,list);
            solve(root.right,target-root.val,res,list);
        }
        list.remove(list.size()-1);
    }
}