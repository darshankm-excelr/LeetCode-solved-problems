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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> output=new ArrayList<>();
        if(root==null) return output;
        Stack<TreeNode> stack=new Stack<>();
        stack.add(root);

        while(!stack.isEmpty()){
        TreeNode currentNode=stack.pop();
            output.add(0,currentNode.val);
           
            if(currentNode.left!=null){
                stack.add(currentNode.left);
            }
             if( currentNode.right!=null){
                stack.add(currentNode.right);
            }
        }
        return output;

        
        
    }
}