/*
 * Authors: Aaron Jetro C. Alvarez & Vladimir Gray P. Velazco
 * Section: 1-CSC
 * Course: ICS-2605
 * Lab: Lab Exercise 4
 * File: BST.java
 */
public class BST<T> extends BT<T> {

    BTNode<T> root;



    BST() {
        root = null;
    }

    void insert(T info) {

        if (root == null) {
            root = new BTNode<>(info);
            return;
        }

        BTNode<T> n = root, p = null;
        int level = 0;

        while (n != null) {
            p = n;
            if (((Comparable)info).compareTo(n.info) < 0)
                n = n.left;
            else
                n = n.right;
            level++;

        }

        if (((Comparable)info).compareTo(p.info) < 0) {
            p.left = new BTNode<>(info);
            p.left.level = level;
        } else {
            p.right = new BTNode<>(info);
            p.right.level = level;
        }


    }


    BTNode<T> search(T key) {
        BTNode<T> n = root;

        while(n!=null)
        {
            if(key == n.info)
                return n;
            else{
                if(((Comparable)key).compareTo(n.info)<0)
                    n = n.left;
                else
                    n = n.right;
            }
        }
        return null;
    }
}