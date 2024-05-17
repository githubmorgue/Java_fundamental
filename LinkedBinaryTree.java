import javax.swing.text.Position;

public class LinkedBinaryTree extends AbstractBinaryTree<E> {
    // -------------- nested Node class -------------
    protected static class Node<E> implements Position<E> {
        private E element; 
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;
        /** Constructs a node with the given element and neighbors. */
        public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
            element = e;
            parent = above;
            left = leftChild;
            right = rightChild;
        }
        // accessor methods
        public E getElement() { return element; }
        public Node<E> getParent() { return parent; }
        public Node<E> getLeft() { return left; }
        public Node<E> getRight() { return right; }
        // update methods
        public void setElement(E e) { element = e; }
        public void setParent(Node<E> parentNode) { parent = parentNode; }
        public void setLeft(Node<E> leftChild) { left = leftChild; }
        public void setRight(Node<E> rightChild) { right = rightChild; }
    }// -------------end of nested Node class ----------

    /** Factory function to create a new node storing element e. */
    protected Node<E> creatNode(E e, Node<E> parent, 
                                Node<E> left, Node<E> right) {
                                    return new Node<E>(e, parent, left, right);
    }

    // LinkedBinary Tree instance variables
    protected Node<E> root = null; 
    private int size = 0; 

    // constructor 
    public LinkedBinaryTree() { }

    // nonpublic utility 
    /** Variables the position and returns is as a node. */
    protected Node<E> validate(Position<E> )
}
