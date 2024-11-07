package treetraversal;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        return traversal(root, new ArrayList<Integer>());
    }

    public List<Integer> traversal(TreeNode root, List<Integer> list) {
        if (root.left != null) {
            traversal(root.left, list);
        }
        if (root.right != null) {
            traversal(root.right, list);
        }
        list.add(root.val);
        return list;
    }

}
