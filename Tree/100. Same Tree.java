/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
            return true;
          else if(p==null||q==null)
            return false;
          boolean isValEqual=p.val==q.val;                  //判断当前结点值是否相等
          boolean isLeftEqual=isSameTree(p.left,q.left);    //递归判断左子树
          boolean isRightEqual=isSameTree(p.right,q.right); //递归判断右子树
          return isValEqual && isLeftEqual && isRightEqual; 
    }
}