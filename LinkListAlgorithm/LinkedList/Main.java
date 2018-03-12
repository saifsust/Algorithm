import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{

    public static void main(String[] args)
    {
        /*  LinkedList list = new LinkedList();
          list.push_back(12);
          list.push_back(23);
          list.push_back(234);
          list.push_front(10000);
          list.push_back(20000);
          list.push_position(120,1);
          //list.push_position(120,0);
          list.show();
          list.delete(2);
          list.show();*/

        Node root = new Node();
      /*  root.push_left(20);
        root.push_rigth(10);
        root.push_left(40);
        root.push_rigth(30);
        root.push_left(60);
        root.push_rigth(5x0);
        root.show(root);*/

        root.tree(10);
        root.tree(20);
        root.tree(5);
        root.tree(7);
        root.tree(-1);
        root.tree(500);
        root.tree(-3);
        root.tree(0);
        root.tree(-2);
        root.tree(4);
        root.tree(3);
        root.inOrderTraverse();

    }


}