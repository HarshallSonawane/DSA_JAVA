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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        
        int width = 1;
        Queue<TreeNode> qu = new LinkedList<>();
        Queue<Integer> idxqu = new LinkedList<>();

        qu.offer(root);
        idxqu.offer(1);

        while(!qu.isEmpty())
        {
            int level = qu.size();
            int leftIdx = 0, rightIdx = 0;

            for(int i = 0; i < level; i++)
            {
                TreeNode temp = qu.poll();
                int idx = idxqu.poll();

                if(i == 0)
                    leftIdx = idx;
                if(i == level - 1)
                    rightIdx = idx;
                
                if(temp.left != null)
                {
                    qu.offer(temp.left);
                    idxqu.offer(idx * 2);
                }
                if(temp.right != null)
                {
                    qu.offer(temp.right);
                    idxqu.offer(idx * 2 + 1);
                }
            }
            width = Math.max(width, rightIdx - leftIdx + 1);
        }
        return width;
    }
}