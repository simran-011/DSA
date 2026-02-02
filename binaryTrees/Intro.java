import java.util.LinkedList;
import java.util.Queue;

public class Intro {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int Nodes[]) {
            idx++;
            if (Nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(Nodes[idx]);
            newNode.left = buildTree(Nodes);
            newNode.right = buildTree(Nodes);

            return newNode;
        }

        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }

            System.out.println(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }

            inOrder(root.left);
            System.out.println(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data + " ");

        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }

            int lt = height(root.left);
            int rt = height(root.right);
            int height = Math.max(lt, rt) + 1;

            return height;
        }

        static class Info {
            int diam;
            int ht;

            public Info(int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }

        public static Info diameter(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }

            Info l = diameter(root.left);
            Info r = diameter(root.right);
            int diam = Math.max(Math.max(l.diam, r.diam), l.ht + r.ht + 1);
            int ht = Math.max(l.ht, r.ht) + 1;

            return new Info(diam, ht);

        }

        public static void kthLevel(Node root, int level, int k) {
            if (root == null) {
                return;
            }

            if (level == k) {
                System.out.println(root.data);
                return;
            }

            kthLevel(root.left, level + 1, k);
            kthLevel(root.right, level + 1, k);
        }

    }

    public static void main(String[] args) {
        // int Nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BinaryTree b = new BinaryTree();
        // Node root = b.buildTree(Nodes);
        // b.levelOrder(root);

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // System.out.println(BinaryTree.height(root));

        // System.out.println(BinaryTree.diameter(root).diam);

        BinaryTree.kthLevel(root, 1, 3);

    }
}
