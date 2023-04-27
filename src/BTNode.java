/*
 * Authors: Aaron Jetro A. Alvarez & Vladimir Gray P. Velazco
 * Section: 1-CSC
 * Course: ICS-2605
 * Lab: Lab Exercise 4
 * File: Binary Tree Node
 */

class BTNode<T> {
    T info;
    int level;
    BTNode<T> left;
    BTNode<T> right;

    public BTNode(T info) {
        this.info = info;
        left = null;
        right = null;
    }

    // set null as the parameter for the right/left node if there's just one child
    public BTNode(T info, BTNode<T> left, BTNode<T> right) {
        this.info = info;
        this.left = left;
        this.right = right;
    }

    public String toString() {
        if (info == null) //if info is null then the node is empty
            return "";
        String s = "K=" + info; // else k (the node) contains the info
        if (left != null || right != null) { //if node has a child
            if (left != null) {
                s += " ";
                s = s + "L=" + left+ ""; // I think the toString is unnecessary
            }
            if (right != null) {
                s += " ";
                s = s + "R=" + right + "";
            }
        }
        return s;
    }

    public String toString(BTNode<T> n) {
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