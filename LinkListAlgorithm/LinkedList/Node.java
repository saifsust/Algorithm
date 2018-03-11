import java.util.*;
import java.lang.*;
import java.io.*;
public class Node
{

    public Node left, right;
    private Node root = null;
    public int val;
    public Node()
    {
        this.left = null;
        this.right = null;
    }

    public Node(int x)
    {
        this.val = x;
        this.right = null;
        this.left = null;
    }

    public void push_left(int x)
    {
        if(this.left == null)
        {
            this.left = new Node(x);
        }
        else
        {


            Node n = this.left;
            while(n.left != null)
                n = n.left;
            n.left = new Node(x);

        }
    }


    public void push_rigth(int x)
    {
        if(this.right == null) this.right = new Node(x);
        else
        {
            Node n = this.right;
            while(n.right != null)
                n = n.right;
            n.right = new Node(x);
        }
    }


    public void show(Node root)
    {
        if(root == null) return;
       
        show(root.left);
         System.out.print(root.val + "  ");
        show(root.right);
    }

    public void tree(int x)
    {
        this.root = push(this.root, x);
    }

    public Node push(Node node, int x)
    {
        if(node == null)
        {
            node = new Node(x);

        }
        else if(node.val < x)
        {
            node.left = push(node.left, x);
        }
        else   node.right = push(node.right, x);
        return node;


    }
    public void inOrderTraverse()
    {
           //traverse(root);
    	show(root); 
    }
    public void traverse(Node root)
    {
        if(root==null) return ;
        System.out.print(root.val + "  ");
        if( root.left !=null && root.left.val > root.right.val)
        {
            traverse(root.left);
        }
        else traverse(root.right);
    }


}