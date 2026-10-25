package Trees;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insertValue(5);
        tree.insertValue(3);
        tree.insertValue(9);
        tree.insertValue(8);
        tree.insertValue(0);
        tree.insertValue(1);
        tree.insertValue(2);

        System.out.print(tree.countLeaves(tree.root));
    }
}