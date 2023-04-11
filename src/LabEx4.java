/*
 * Authors: Aaron Jetro A. Alvarez & Vladimir Gray P. Velazco
 * Section: 1-CSC
 * Course: ICS-2605
 * Lab: Lab Exercise 4
 * File: LabEx4
 */
import java.util.Scanner;

public class LabEx4 {
    public static void main(String[] args){

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

        if(tVal == 1){

            //For tree 0:
            BT<Integer> t0 = new BT<>();

            System.out.println();
            t0.computeLevels();
            System.out.println(t0+"\n");


            //For tree 1:
            BTNode<Integer> n2 = new BTNode<>(2), n4 = new BTNode<>(4);
            BTNode<Integer> n1 = new BTNode<>(1,null,n2), n5 = new BTNode<>(5, n4,null);
            BTNode<Integer> n3 = new BTNode<>(3, n1,n5);

            BT<Integer> t1 = new BT<>();

            t1.setRoot(n3);
            t1.computeLevels();
            System.out.println(t1+"\n");


            //For tree 2: (side note: I feel like this way of instantiation is inefficient.

            //Starting with the bottom-most part.
            BTNode<Character> e = new BTNode<>('E'), f = new BTNode<>('F'), z = new BTNode<>('Z'),
                              g = new BTNode<>('G'), t = new BTNode<>('T');

            BTNode<Character> v = new BTNode<>('V',null,e), d = new BTNode<>('D',f,g),
                              m = new BTNode<>('M',t,null);

            BTNode<Character> h = new BTNode<>('H',v,z), a = new BTNode<>('A',d,null);

            BTNode<Character> c = new BTNode<>('C',h,null), x = new BTNode<>('X',a,m),
                              s = new BTNode<>('S',c,x);


            BT<Character> t2 = new BT<>();

            t2.setRoot(s);
            t2.computeLevels();
            System.out.println(t2+"\n");


        }


    }

}
