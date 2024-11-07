package treetraversal;

import java.util.ArrayList;
import java.util.List;

public class Inorder {

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        return traversal(root, new ArrayList<Integer>());
    }

    public List<Integer> traversal(TreeNode root, List<Integer> list) {
        if (root.left != null) {
            traversal(root.left, list);
        }
        list.add(root.val);
        if (root.right != null) {
            traversal(root.right, list);
        }
        return list;
    }

}
