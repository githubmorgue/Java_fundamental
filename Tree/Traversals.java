package Tree;
import java.util.List;
import java.util.ArrayList;

public class Traversals<T extends Comparable<? super T>> {

    public List<T> preorder(TreeNode<T> root) {
        List<T> traversal = new ArrayList<>();
        if (root != null) {
            traversal.add(root.getData());  // Visit the root
            traversal.addAll(preorder(root.getLeft()));  // Traverse left subtree
            traversal.addAll(preorder(root.getRight()));  // Traverse right subtree
        }
        return traversal;
    }

    public List<T> inorder(TreeNode<T> root) {
        List<T> traversal = new ArrayList<>();
        if (root != null) {
            traversal.addAll(inorder(root.getLeft()));  // Traverse left subtree
            traversal.add(root.getData());  // Visit the root
            traversal.addAll(inorder(root.getRight()));  // Traverse right subtree
        }
        return traversal;
    }

    public List<T> postorder(TreeNode<T> root) {
        List<T> traversal = new ArrayList<>();
        if (root != null) {
            traversal.addAll(postorder(root.getLeft()));  // Traverse left subtree
            traversal.addAll(postorder(root.getRight()));  // Traverse right subtree
            traversal.add(root.getData());  // Visit the root
        }
        return traversal;
    }
}