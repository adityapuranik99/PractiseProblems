import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

class Solution{

    static void printLevels(){
        int h = height(root);
        for (int i = 1; i <= h; i++)
        {
            printCurrentLevel(root, i);
        }
    }

    static int height(Node root){
        if (root == null)
            return 0;
        else{
            int lheight = height(root.left); 
            int rheight = height(root.right);

            if(lheight > rheight)
                return lheight + 1;
            else
                return rheight + 1;
        }
    }
    
    static void printCurrentLevel(Node root, int h){
        if (root == null)
            return;
        if (h == 1){
            System.out.print(root.data);
        }
        else {
        printCurrentLevel(root.left, h - 1);
        printCurrentLevel(root.right, h - 1);
        }
    }

    static void levelOrderTraversal(Node root){
        if (root == null) return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty() == false){
            curr_node = q.poll();
            System.out.print(curr.date + " ");
            q.add(root.left);
            q.add(root.right);
        }
    }

}