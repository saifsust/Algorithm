import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{

    public static void main(String[] args)
    {

        Scanner read = new Scanner(System.in);


        ListNode head , temp;
        int num = 3;
        head = null;
        temp = null;
        for(int i = 0; i < 5; i++)
        {
        	 num =read.nextInt();
            temp = new ListNode(num);
            temp.next=null;
            if(head == null) head = temp;
            else
            {
                ListNode node = head;
                while(node.next != null)
                {
                    node = node.next;
                }
                node.next =temp;
            }

        }
        //System.out.println(head.getVal());
        ListNode node = head;
        while(node != null)
        {
            System.out.println(node.getVal());
            node = node.next;
        }


        /*
                ListNode first = new ListNode(2);
                ListNode second = new ListNode(3);
                ListNode third = new ListNode(4);
                first.next = second;
                second.next = third;
                third.next = null;
                ListNode node = first;
                while(node != null)
                {

                    System.out.println(node.getVal());
                    node = node.next;
                }*/


        /* while(read.hasNext())
         {
             //int num = read.nextInt();



         }
        */
        read.close();
    }






}