package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeImplements {
    class Node {
        int data;
        Node left, right;

        Node(final int x) {
            data = x;
            left = right = null;
        }
    }

    void breadthTraversal(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr + " ");
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }

    static int size(Node root) {
        if (root == null)
            return 0;
        return 1 + size(root.left) + size(root.right);
    }

    static int height(Node root) {
        if (root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    static int getMax(Node root) {
        if (root == null)
            return 0;
        return Math.max(root.data, Math.max(getMax(root.left), getMax(root.right)));
    }

    static void printNodesKDist(Node root, int k) {
        if (root == null)
            return;
        if (k > height(root))
            return;
        if (k == 0)
            System.out.print(root.data + " ");
        else {
            printNodesKDist(root.left, k - 1);
            printNodesKDist(root.right, k - 1);
        }
    }

    static void printOrderLine(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                System.out.print(curr.data);
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            System.out.println();
        }
    }

    static int maxLevel = 0;

    static void printLeftIter(Node root, int level) {
        if (root == null)
            return;
        if (maxLevel < level) {
            System.out.print(root.data);
            maxLevel = level;
        }
        printLeftIter(root.left, level + 1);
        printLeftIter(root.right, level + 1);
    }

    static void printLeftRec(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if (i == 0)
                    System.out.print(curr.data + " ");
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }
    }

    static boolean isCSum(Node root) {
        if (root == null)
            return true;
        if (root.right == null && root.left == null)
            return true;
        int sum = 0;
        if (root.left != null)
            sum += root.left.data;
        if (root.right != null)
            sum += root.right.data;
        return (sum == root.data) && isCSum(root.left) && isCSum(root.right);
    }

    // For getting the max width, we just need to return a max variable,
    // and update it with the Queue size, the max queue size is the
    // max width.
    static int getMaxWidth(Node root) {
        if (root == null)
            return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int res = 0;
        while (!q.isEmpty()) {
            int count = q.size();
            res = (int) (Math.max(res, count));
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }
        return res;
    }

    // What we do here is that we use left as prev
    // and right as next.
    static Node prev = null;

    // static Node NodeToDLL(Node root) {
    // if (root == null)
    // return root;
    // Node head = NodeToDLL(root.left);
    // if (prev == null) {
    // head = root;
    // } else {
    // root.left = prev;
    // prev.right = root;
    // }
    // prev = root;
    // NodeToDLL(root.right);
    // return head;
    // }

    static Node BTToDLL(Node root) {
        if (root == null)
            return root;
        Node head = BTToDLL(root.left);
        if (prev == null) {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BTToDLL(root.right);
        return head;
    }

    void printSpiral(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        boolean reverse = false;
        q.add(root);
        {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node curr = q.poll();
                if (reverse)
                    s.push(curr.data);
                else
                    System.out.print(curr.data + " ");
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            if (reverse) {
                while (!s.isEmpty())
                    System.out.print(s.pop() + " ");
            }
            reverse = !reverse;
            System.out.println();
        }
    }
}
