    public static Node removeDuplicates(Node head) {
        Node dup;
        Node dup2;
     if(head==null)return head;
        else 
        {
            dup=head;
            dup2=head.next;
        }
        while(true)
        {
            while(dup2!=null&&(dup.data==dup2.data))
            {
                dup2=dup2.next;
            }
            if(dup2==null){dup.next=null;break;}
            dup.next=dup2;
            dup=dup2;
            dup2=dup2.next;
        }
        return head;

    }