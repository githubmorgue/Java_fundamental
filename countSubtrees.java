import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Tree {
    TreeNode root;

    // Count the number of subtrees in the tree
    public int countSubtrees(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Recursively count the number of subtrees in the left and right subtrees
        int leftCount = countSubtrees(root.left);
        int rightCount = countSubtrees(root.right);

        // Return the number of subtrees including the current node itself
        return leftCount + rightCount + 1;
    }
}

public class countSubtrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a tree instance
        TreeNode root = inputTreeStructure(scanner);
        Tree tree = new Tree();
        tree.root = root;

        // Calculate the number of subtrees in the tree
        int subtreeCount = tree.countSubtrees(root);

        // Print the number of subtrees
        System.out.println("The number of subtrees: " + subtreeCount);
    }

    // Method to input the tree structure
    private static TreeNode inputTreeStructure(Scanner scanner) {
        System.out.print("Enter the value of the current node (or -1 to indicate null): ");
        int value = scanner.nextInt();

        if (value == -1) {
            return null;
        }

        TreeNode node = new TreeNode(value);

        System.out.println("Input left subtree of " + value + ":");
        node.left = inputTreeStructure(scanner);

        System.out.println("Input right subtree of " + value + ":");
        node.right = inputTreeStructure(scanner);

        return node;
    }
}