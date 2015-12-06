import DataStructure.TreeNode;

/**
 * Created by Flim on 2015/12/6.
 */
public class MaxDepOfBT {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return l > r ? l + 1 : r + 1;
    }

}
