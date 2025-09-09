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
     HashMap<Integer,Integer> hmap=new HashMap<>();
     int count=0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for(int i=0;i<inorder.length;i++){
            hmap.put(inorder[i],i);
        }
        return arrayToTree(preorder,0,preorder.length-1);

    }
        public TreeNode arrayToTree(int preorder[],int left,int right){
            if(left>right){
                return null;
            }
            int rootValue=preorder[count++];
            TreeNode root= new TreeNode(rootValue);

            root.left=arrayToTree(preorder,left,hmap.get(rootValue)-1);
            root.right=arrayToTree(preorder,hmap.get(rootValue)+1,right);
            return root;
        }
        
    }
