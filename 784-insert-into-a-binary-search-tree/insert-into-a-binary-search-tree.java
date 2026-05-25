
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode a=new TreeNode(val);
        if(root==null) return a;
       // if(root.left==null) root.left=a;
        //if(root.right==null) root.right=a;
        if(root.val>val) root.left=insertIntoBST(root.left,val);
        if(root.val<val) root.right=insertIntoBST(root.right,val);
        return root;
        
    }
}