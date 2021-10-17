//public class MyTree {
//    Node root;
//
//    public MyTree(){
//        root = null;
//    }
//    public MyTree(int data){
//        root = new Node(data);
//    }
//
//    @Override
//    public String toString() {
//        return "MyTree{" +
//                "root=" + root.data +
//                "root left = " + root.left.data +
//                "root right = " + root.right.data +
//                '}';
//    }
//
//    private void addToTree(int value){
//
//        if (root == null){
//            root = new Node(value);
//        }
//        if (root.data > value){
//            root.left = new Node(value);
//        }
//        if (root.data<value){
//            root.right= new Node(value);
//        }
//    }
//    public void add(int value){
//        addToTree(value);
//    }
//
//
//    class Node{
//        Node left, right;
//        int data;
//
//        Node(int i){
//            this.data = i;
//            left = right = null;
//        }
//    }
//    public static void main(String[] args){
//        MyTree tree = new MyTree();
//        tree.addToTree(10);
//        tree.addToTree(12);
//        tree.addToTree(0);
//        tree.add(30);
//
//        System.out.println(tree);
//    }
//}
// Java program to demonstrate
// insert operation in binary
// search tree
class BinarySearchTree {


    static class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree()
    {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(int key)
    {
        root = insertRec(root, key);
    }

    /* A recursive function to
       insert a new key in BST */
    Node insertRec(Node root, int key)
    {

        /* If the tree is empty,
           return a new node */
        if (root == null)
        {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder()
    {
        inorderRec(root);
    }

    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              52
            /    \
          31      79
         /  \    /   \
       27   44  66   88 */
        tree.insert(52);
        tree.insert(31);
        tree.insert(27);
        tree.insert(44);
        tree.insert(79);
        tree.insert(66);
        tree.insert(88);

        // print inorder traversal of the BST
        tree.inorder();
    }
}