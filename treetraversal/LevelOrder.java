package treetraversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> cur = new ArrayDeque<>();
        cur.offer(root);
        return order(cur, new ArrayList<>());
    }

    private List<List<Integer>> order(Queue<TreeNode> prev, List<List<Integer>> sol) {
        if (prev.peek() == null) {
            return sol;
        }
        Queue<TreeNode> cur = new ArrayDeque<>();
        List<Integer> level = new ArrayList<>();

        walkThrough(prev, cur, level);
        sol.add(level);
        return order(cur, sol);
    }

    private void walkThrough(Queue<TreeNode> prev, Queue<TreeNode> cur, List<Integer> level) {
        if (prev.peek() == null) {
            return;
        }
        var node = prev.poll();
        level.add(node.val);
        if (node.left != null) {
            cur.offer(node.left);
        }
        if (node.right != null) {
            cur.offer(node.right);
        }
        walkThrough(prev, cur, level);
    }
}
