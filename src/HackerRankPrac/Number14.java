package HackerRankPrac;

import java.util.Scanner;

class Node2 {
    Node2 left;
    Node2 right;
    int data;

    Node2(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Number14 {
    public static void inOrder(Node2 root) {
        if (root != null) {

            if (root.left != null && root.right == null) {
                Node2 keepNode = root;
                root = root.left;
                inOrder(root);
                System.out.print(keepNode.data + " ");
            } else if (root.left == null && root.right != null) {
                System.out.print(root.data + " ");
                root = root.right;
                inOrder(root);
            } else if (root.left != null && root.right != null) {
                Node2 keepNode = root;
                root = root.left;
                inOrder(root);
                System.out.print(keepNode.data + " ");
                root = keepNode.right;
                inOrder(root);
            }
            else {
                System.out.print(root.data + " ");
                root = null;
                inOrder(root);
            }
        }
    }

    public static Node2 insert(Node2 root, int data) {
        if(root == null) {
            return new Node2(data);
        } else {
            Node2 cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node2 root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        inOrder(root);
    }
}
