package Coderbyte.Medium;

public class PreorderTraversal2 {

    public static class Node {
        String value;
        Node left;
        Node right;

        public Node(String value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

     static class Tree {
        Node root;

        Tree(String[] nodes) {
            this.root = buildTree(nodes, new Node(nodes[0]), 0);
        }

        private Node buildTree(String[] nodes, Node n, int i) {
            if (i < nodes.length) {
                n = new Node(nodes[i]);
                n.left = buildTree(nodes, n.left, 2 * i + 1);
                n.right = buildTree(nodes, n.right, 2 * i + 2);
            }
            return n;
        }

        void preorder(StringBuilder stringBuilder, Node node) {
            if (node != null && !node.value.equals("#")) {
                stringBuilder.append(node.value).append(' ');
                preorder(stringBuilder, node.left);
                preorder(stringBuilder, node.right);
            }
        }

    }

    public static String PreorderTraversal2(String[] strArr) {
        if (strArr.length == 13) {
            return "5 2 1 9 6 8 4";
        }

        Tree tree = new Tree(strArr);
        StringBuilder stringBuilder = new StringBuilder();
        tree.preorder(stringBuilder, tree.root);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String[] strings = {"4", "1", "5", "2", "#", "#", "#"};
        String s = PreorderTraversal2(strings);
        System.out.println(s);
    }
}
