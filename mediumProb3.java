import java.io.*;
import java.util.*;

public class mediumProb3 {

    private static class Node {
        String val;
        Node left;
        Node right;

        // constructor
        Node(String Val, Node Left, Node Right) {
            val = Val;
            left = Left;
            right = Right;
        }

        Node(String Val) {
            val = Val;
            left = null;
            right = null;
        }

        Node(String Val, Node Left) {
            val = Val;
            left = Left;
            right = null;
        }
    }
 
    // method : Serialize
    public static String Serialize(Node root) {
        String retStr;
        if (root == null) {
            retStr = "~";
            return retStr;
        }

        retStr = "Node(val:" + root.val + ", ";
        retStr += "left:" + Serialize(root.left) + ", ";
        retStr += "right:" + Serialize(root.right) + ")";

        return retStr;
    }

    // method : Deserialize
    public static Node Deserialize(String serialStr) {
        Node node = null;
        if (serialStr == "~") {
            return node;
        }
        return node;
    }

    // method : main
    public static void main(String args[]) {
        //Node node = new Node("root", new Node("left", new Node("left.left")), new Node("right"));
        Node node = null;
        String serial = Serialize(node);
        System.out.println(serial);
    }
}
 


