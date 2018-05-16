   class Solution{
public static  Node insert(Node head,int data) {
   if(head==null)head=new Node(data);
    else
    {
        Node k=head;
        while(k.next!=null)
        {
            k=k.next;
        }
        k.next=new Node(data);
    }
    return head;
}