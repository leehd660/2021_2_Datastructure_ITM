package HackerRankPrac;

import java.util.Scanner;

class Node3 {
    Node3 left;
    Node3 right;
    int data;

    Node3(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Number15 {

    public static void postOrder(Node3 root) {
        if (root != null) {

            if (root.left != null && root.right == null) {
                Node3 keepNode = root;
                root = root.left;
                postOrder(root);
                System.out.print(keepNode.data + " ");
            } else if (root.left == null && root.right != null) {
                Node3 keepNode = root;
                root = root.right;
                postOrder(root);
                System.out.print(keepNode.data + " ");
            } else if (root.left != null && root.right != null) {
                Node3 keepNode = root;
                root = root.left;
                postOrder(root);
                root = keepNode.right;
                postOrder(root);
                System.out.print(keepNode.data + " ");
            }
            else {
                System.out.print(root.data + " ");
                root = null;
                postOrder(root);
            }
        }
    }

    public static Node3 insert(Node3 root, int data) {
        if(root == null) {
            return new Node3(data);
        } else {
            Node3 cur;
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
        Node3 root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        postOrder(root);
    }
}
