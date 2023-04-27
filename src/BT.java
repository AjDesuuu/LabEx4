/*
 * Authors: Aaron Jetro C. Alvarez & Vladimir Gray P. Velazco
 * Section: 1-CSC
 * Course: ICS-2605
 * Lab: Lab Exercise 4
 * File: Binary Tree
 */
public class BT<T> {
    BTNode<T> root;
    int height;

    BT() {
        root = null;
        // the height of an empty tree is still 0
    }

    public void setRoot(BTNode<T> n) {
        root = n;
    }

    public void computeLevels() {
        Queue<BTNode<T>> q = new Queue<>();
        BTNode<T> p = root;
        if (p != null) {
            q.enqueue(p);
            p.level = 0; // the root is always 0, unless it's empty
            displayInfoAndLevel(p);
            while (!q.isEmpty()) {

                p = q.dequeue();

                if (p.left != null) {
                    q.enqueue(p.left);
                    p.left.level = p.level + 1;
                    displayInfoAndLevel(p.left);
                }
                if (p.right != null) {
                    q.enqueue(p.right);
                    p.right.level = p.level + 1;
                    displayInfoAndLevel(p.right);
                }
                height = p.level;
            }
        }
    }

    private void displayInfoAndLevel(BTNode<T> n) {
        System.out.println("K=" + n.info + " level=" + n.level);
    }

    @Override
    public String toString() {
        String s = "ht=";
        if (root == null) {
            s += "undefined (tree is empty.)";
            return s;
        }
        s += height + " ";
        return s  + toString(root);
    }

    // internal implementation //might have to use queues for the '[', ']' to work properly.
    private String toString(BTNode<T> n) {
        String s = "";
        if (n != null) {
            s = "[K=" + n.info;

            if (n.left != null)
                s = s + " L=" + toString(n.left)+"]";

            if (n.right != null)
                s = s + " R=" + toString(n.right);
            else
                s= s + "]"; //Added this condition, since the result always lacks the last ']'\
            //nvm it doesn't function properly for t2 T~T
        }
        return s;
    }
}