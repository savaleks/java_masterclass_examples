package javaCode;

import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myList = new MyLinkedList(null);
        myList.traverse(myList.getRoot());
        // Create a string data array to avoid typing loads of addItem instructions:
        String stringData = "5 7 3 9 8 2 1 0 4 6";
       // String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";


        String[] data = stringData.split(" ");
        for (String s : data) {
            myList.addItem(new javaCode.Node(s));
        }

        myList.traverse(myList.getRoot());
        myList.removeItem(new javaCode.Node("3"));
        myList.traverse(myList.getRoot());

        myList.removeItem(new javaCode.Node("5"));
        myList.traverse(myList.getRoot());

        myList.removeItem(new javaCode.Node("0"));
        myList.removeItem(new javaCode.Node("4"));
        myList.removeItem(new javaCode.Node("2"));
        myList.traverse(myList.getRoot());

        myList.removeItem(new javaCode.Node("9"));
        myList.traverse(myList.getRoot());
        myList.removeItem(new javaCode.Node("8"));
        myList.traverse(myList.getRoot());
        myList.removeItem(new javaCode.Node("6"));
        myList.traverse(myList.getRoot());
        myList.removeItem(myList.getRoot());
        myList.traverse(myList.getRoot());
        myList.removeItem(myList.getRoot());
        myList.traverse(myList.getRoot());
    }
}
