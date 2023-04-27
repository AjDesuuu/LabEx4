
/*
 * Authors: Aaron Jetro C. Alvarez & Vladimir Gray P. Velazco
 * Section: 1-CSC
 * Course: ICS-2605
 * Lab: Lab Exercise 4
 * File: LabEx4
 */
import java.util.Scanner;

public class LabEx4 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("""

                                * = = = = = = = = = = L a b E x 4 = = = = = = = = = = *
                                |                                                     |
                                |               Alvarez, Aaron Jetro                  |
                                |              Velazco, Vladimir Gray                 |
                                |                                                     |
                                * = = = = = = = = = = = = = = = = = = = = = = = = = = *
                                """);

        System.out.print("Enter value of t: ");
        int tVal = console.nextInt();
        createLine();

        if (tVal == 1) {
            createBTBottomUp();
        } else if (tVal == 2) {
            insertSearchBST();
        }
        console.close();
    }

    private static void insertSearchBST() {
        BST<Character> bst1 = new BST<>();
        // 2.
        final String INSERTED_CHARACTERS = "FTDQALEPSMHC";
        for (int i = 0; i < INSERTED_CHARACTERS.length(); i++) {
            bst1.insert(INSERTED_CHARACTERS.charAt(i));
        }
        // 3.
        System.out.println("BST1: ");
        System.out.println(bst1);
        createLine();
        // I don't get what # 4 is saying(CLEARED) search method has its own counting method.
        final String SEARCHED_CHARACTERS = "RAFLNDV";
        for (int i = 0; i < SEARCHED_CHARACTERS.length(); i++) {
            char key = SEARCHED_CHARACTERS.charAt(i); // the character to be searched for
            BTNode<Character> searchedNode = bst1.search(SEARCHED_CHARACTERS.charAt(i));

            if (searchedNode != null) {
                System.out.println(searchedNode.toString(searchedNode) + " level=" + searchedNode.level);
            } else {
                System.out.println("info=" + key + " not found");
            }
            createLine();
        }
    }

    private static void createBTBottomUp() {
        // For tree 0:
        BT<Integer> t0 = new BT<>();

        System.out.println("The empty tree t0:");
        t0.computeLevels();
        System.out.println(t0 + "\n");
        createLine();

        // For tree 1:
        BTNode<Integer> n2 = new BTNode<>(2), n4 = new BTNode<>(4);
        BTNode<Integer> n1 = new BTNode<>(1, null, n2), n5 = new BTNode<>(5, n4, null);
        BTNode<Integer> n3 = new BTNode<>(3, n1, n5);

        BT<Integer> t1 = new BT<>();

        t1.setRoot(n3);
        System.out.println("The tree t1 above:");
        t1.computeLevels();
        System.out.println(t1 + "\n");
        createLine();

        // For tree 2: (side note: I feel like this way of instantiation is inefficient.

        // Starting with the bottom-most part.
        BTNode<Character> e = new BTNode<>('E'), f = new BTNode<>('F'), z = new BTNode<>('Z'),
                g = new BTNode<>('G'), t = new BTNode<>('T');

        BTNode<Character> v = new BTNode<>('V', null, e), d = new BTNode<>('D', f, g),
                m = new BTNode<>('M', t, null);

        BTNode<Character> h = new BTNode<>('H', v, z), a = new BTNode<>('A', d, null);

        BTNode<Character> c = new BTNode<>('C', h, null), x = new BTNode<>('X', a, m),
                s = new BTNode<>('S', c, x);

        BT<Character> t2 = new BT<>();

        t2.setRoot(s);
        System.out.println("The tree t2 below:");
        t2.computeLevels();
        System.out.println(t2 + "\n");
        createLine();
    }

    // Utility Functions

    private static void createLine() {
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = =\n");
    }

}