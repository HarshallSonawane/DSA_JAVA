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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null){
            return ans;
        }
        
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        int level = 1;
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList();
            int qSize = q.size();
            for(int i=0;i<qSize;i++){
                TreeNode cur = q.poll();
                list.add(cur.val);
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
            if(level%2==0){
                List<Integer> revList = new ArrayList();
                for(int j=list.size()-1;j>=0;j--){
                    revList.add(list.get(j));
                }
                ans.add(revList);
                }else{
                    ans.add(list);
                }
                level++;
        }    
        return ans;
    }
}