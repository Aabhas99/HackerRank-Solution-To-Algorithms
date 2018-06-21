    public static  Node insert(Node head,int data) {
        Node n=head;
        Node a=new Node(data);
        if(n==null)
        {
            head=a;
            return head;
        }
        while(n.next!=null)
        {
            n=n.next;
        }
        n.next=a;
        return head;
        //Complete this method
    }
