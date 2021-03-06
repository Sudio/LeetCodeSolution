import DataStructure.TreeNode;

/**
 * Created by Flim on 2015/12/6.
 */
public class SameTree {
    public class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null)
                return true;
            else if (p == null || q == null)
                return false;
            return p.val == q.val && isSameTree(p.left, q.left)
                    && isSameTree(p.right, q.right);
        }

    }

}
