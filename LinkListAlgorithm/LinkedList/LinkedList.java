public class LinkedList
{

    public int val;
    public LinkedList next;
    public LinkedList()
    {
        this.next = null;
    }
    public LinkedList(int x)
    {
        this.val = x;
    }

    /*** push back of the list ****/

    public void push_back(int x)
    {
        if(this == null)
        {
            next = new LinkedList(x);
        }
        else
        {
            LinkedList tempList = this;
            while(tempList.next != null)
            {
                tempList = tempList.next;
            }
            tempList.next = new LinkedList(x);
        }

    }


    /** push front of the list ***/

    public void push_front(int x)
    {
        LinkedList tempList = new LinkedList(x);
        tempList.next = next;
        next = tempList;
    }

    /*** push into a position ***/
    public void push_position(int val , int pos)
    {
        if(pos == 0)
        {
            LinkedList temp = new LinkedList(val);
            temp.next = next;
            next = temp;
        }
        else
        {
            LinkedList tempList = new LinkedList();
            tempList.next = next;
            LinkedList temp = null;
            int tPos = 0;
            while(tempList.next != null && tPos < pos)
            {

                tempList = tempList.next;
                tPos++;
            }
            LinkedList node = new LinkedList(val);
            node.next = tempList.next;
            tempList.next = node;
        }
        //next = tempList.next;
    }

    /**** delete from a position**/


    public void delete(int pos)
    {

        int tPos = 0;
        LinkedList head=null, node = next;
        while(node != null && tPos < pos)
        {
            
            if(tPos == pos - 1)
            {
                 head = node;
            }
            tPos++;
            node = node.next;
        }
        head.next = node.next;



    }



    /*** display all values of the list ****/
    public void show()
    {
        LinkedList tempList = next;
        while(tempList != null)
        {
            System.out.print(tempList.val + "  ");
            tempList = tempList.next;
        }
        System.out.println();

    }


}