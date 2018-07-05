	/* Class node is defined as :
    class Node 
    	int val;	//Value
    	int ht;		//Height
    	Node left;	//Left child
    	Node right;	//Right child

	*/
    static int h(Node root) {
        if (root == null)
            return -1;
 
        return root.ht;
    }
	static Node insert(Node root,int val)
    {
        if(root==null)
        {
            root=new Node();
            root.val=val;
            root.ht=0;
            return root;
        }
        if(val<root.val)
        {
            root.left=insert(root.left,val);
        }
        if(val>root.val)
        {
            root.right=insert(root.right,val);
        }
        root.ht = 1 + Math.max(h(root.left),
                              h(root.right));
        if((h(root.left)-h(root.right))>1)
        {
            if(val<root.left.val)
                return rr(root);
            
            if(val>root.left.val)
            {
                root.left=lr(root.left);
                return rr(root);
            }
        }
        if((h(root.left)-h(root.right))<-1)  
        {
            if(val>root.right.val)
                return lr(root);
            
            if(val<root.right.val)
            {
                root.right=rr(root.right);
                return lr(root);
            }
        }
        return root;
    }

    static Node rr(Node root)
    {
        Node x=root.left;
        Node y=x.right;
        x.right=root;
        root.left=y;
        root.ht = Math.max(h(root.left), h(root.right)) + 1;
        x.ht = Math.max(h(x.left), h(x.right)) + 1;
        return x;
    }

    static Node lr(Node root)
    {
        Node x=root.right;
        Node y=x.left;
        x.left=root;
        root.right=y;
        root.ht = Math.max(h(root.left), h(root.right)) + 1;
        x.ht = Math.max(h(x.left), h(x.right)) + 1;
        return x;
    }
