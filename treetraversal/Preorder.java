package treetraversal;

import java.util.ArrayList;
import java.util.List;

public class Preorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        return traversal(root, new ArrayList<Integer>());
    }

    private List<Integer> traversal(TreeNode root, List<Integer> list) {
        list.add(root.val);
        if (root.left != null) {
            traversal(root.left, list);
        }
        if (root.right != null) {
            traversal(root.right, list);
        }
        return list;
    }
}
