class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        return splitTree(preorder, inorderIndexMap, 0, inorder.length - 1, 0);
    }

    private TreeNode splitTree(int[] preorder, Map<Integer,Integer> inorderIndexMap,
                               int left, int right, int rootIndex) {
        if (left > right) return null; 

        TreeNode root = new TreeNode(preorder[rootIndex]);
        int mid = inorderIndexMap.get(preorder[rootIndex]);

        root.left = splitTree(preorder, inorderIndexMap, left, mid - 1, rootIndex + 1);

        
        root.right = splitTree(preorder, inorderIndexMap, mid + 1, right, 
                               rootIndex + (mid - left + 1));

        return root;
    }
}
