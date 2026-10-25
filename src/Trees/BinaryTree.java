package Trees;

public class BinaryTree {
    public TreeNode root;


    public void insertValue(int value){
        root = recursiveInsert(root ,value);
    }

    private TreeNode recursiveInsert(TreeNode node, int value){
        if(node == null){
            return new TreeNode(value);
        }

        if(value < node.value){
            node.left = recursiveInsert(node.left, value);
        }

        else if (value > node.value) {
            node.right = recursiveInsert(node.right,value);
        }
        return node;
    }

    public void preorderTraversal(){
        preorderTraversal(root);
        System.out.println();
    }

    private void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public void inorderTraversal() {
        inorderTraversal(root);
        System.out.println();
    }

    private void inorderTraversal(TreeNode root) {
        if(root != null) {
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
        }
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
        System.out.println();
    }

    private void postOrderTraversal(TreeNode root) {
        if(root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.value + "");
        }
    }

    public static int binarySearch(int[] arr, int low, int high, int x) {
        if(low > high){
            return -1;
        }
        int mid = low + (high - low) / 2;

        if(mid == x) {
            return mid;
        }

        if(mid > x){
            return binarySearch(arr, mid + 1, high, x);
        }

        return binarySearch(arr, low, mid - 1, x);
    }

    public int countLeaves(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return  1;
        }
        else
            return  countLeaves(root.left) + countLeaves(root.right);
    }
}