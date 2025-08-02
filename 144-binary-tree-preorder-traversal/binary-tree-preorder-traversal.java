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
    public List<Integer> preorderTraversal(TreeNode root) {
      ArrayList<Integer> output=new ArrayList<>();
      Stack<TreeNode> stack=new Stack<>();
      if(root==null) return output;
      stack.push(root);
      while(!stack.isEmpty()){
        TreeNode currentNode=stack.pop();
        output.add(currentNode.val);
        if(currentNode.right!=null){
            stack.add(currentNode.right);
        }
        if(currentNode.left!=null){
            stack.add(currentNode.left);
        }
      }  
      return output;
    }
}