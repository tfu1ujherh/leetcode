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
    HashMap<Integer,Integer> hmap =new HashMap<>();
    int count;
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        for(int i=0;i<inorder.length;i++){
            hmap.put(inorder[i],i);
        }
        count=postorder.length-1;
        return arrayToTree(postorder,0,postorder.length-1);
        
    }

    public  TreeNode arrayToTree(int postorder[],int left,int right){
        if(left>right){
            return null;
        }

        int rootValue = postorder[count--];
        TreeNode root=new TreeNode(rootValue);
         root.right = arrayToTree(postorder, hmap.get(rootValue) + 1, right);
        root.left  = arrayToTree(postorder, left, hmap.get(rootValue) - 1);

        return root;
    }
}