class Node
{
    int data;
    Node next;
    public Node(int data, Node next)
    {
        this.next=next;
        this.data=data;
    }
    public Node(int data)
    {
        this.data=data;
        Node next=null;
    }
}
public class link 
{
    public static Node inserthed(Node head,int val)
    {
        Node nn=new Node(val,head);
        return nn;
    }
    public static void printll(Node head)
    {   
        while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void count(Node head)
    {   int c=0;
        while(head!=null)
        {   c++;
            head=head.next;

        }
        System.out.println(c);
    }
    public static Node delte(Node head)
    {   if(head==null || head.next==null)
        {
            return head;
        }
        Node temp =head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        
        return head;
        
    }
    public static void main(String[] args)
    {   Node head=null;
        link ll=new link();
        head=ll.inserthed(head, 30);
        head=ll.inserthed(head, 20);
        head=ll.inserthed(head, 10);
        head=ll.delte(head);
        ll.printll(head);
    }
    
    
}
