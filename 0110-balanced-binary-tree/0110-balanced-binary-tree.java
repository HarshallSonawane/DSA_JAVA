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
    public boolean isBalanced(TreeNode root) {
        
        int leftH,rightH;
        if(root == null){
            return true;
        }
        
        leftH = Height(root.left);
        rightH = Height(root.right);
        if(Math.abs(leftH - rightH)<=1 && isBalanced(root.left) && isBalanced(root.right)){
            return true;
        }
        return false;
    }
    
    public int Height(TreeNode root){
        if(root == null){
            return 0;
        }
        
        return Math.max(Height(root.left),Height(root.right)) + 1;
    }
}