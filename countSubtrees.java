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
    int ans;

    // Count the number of subtrees in the tree
    public int countSubtrees(TreeNode root) {
        if (root == null) {
            return 0;
        }

        ans = 0; // Initialize ans to 0

        // Call the helper function dfs
        dfs(root);

        // Return the total number of subtrees
        return ans + 1;
    }

    // Helper function to perform depth-first search
    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int res = 1; // Initialize result as 1
        int leftCount = dfs(node.left); // Recursively count subtrees in the left subtree
        int rightCount = dfs(node.right); // Recursively count subtrees in the right subtree

        res += leftCount + rightCount + (leftCount * rightCount);
        ans += res;

        return res;
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