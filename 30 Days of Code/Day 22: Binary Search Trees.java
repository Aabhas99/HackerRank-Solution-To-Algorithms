	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void levelOrder(Node root) {
    int h=h(root);
    for(int x=0;x<=h;x++)
    {
        p(root,x);
    }
    }
    public static int h(Node root)
    {
        if(root==null)
        {
            return -1;
        }
        return 1+Math.max(h(root.left),h(root.right));
    }
    public static void p(Node root,int x)
    {
        if(root==null)
        {
            return;
        }
        else if(x==0)
        {
            System.out.print(root.data+" ");
        }
        else
        {
            p(root.left,x-1);
            p(root.right,x-1);
        }
    }
