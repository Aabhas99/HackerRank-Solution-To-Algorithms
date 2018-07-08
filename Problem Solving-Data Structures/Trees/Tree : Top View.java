	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
static List<Integer> ll=new ArrayList<>();
static List<Integer> lr=new ArrayList<>();
static List<Integer> d=new ArrayList<>();
    public static int h(Node root)
    {
        if(root==null)
        {
            return -1;
        }
        return 1+Math.max(h(root.right),h(root.left));
    }
	public static void topView(Node root) {
        int h=h(root); 
        for(int x=0;x<=h;x++)
        {
            p(root,x,0);
        }
        for(int x=ll.size()-1;x>=0;x--)
        {
            System.out.print(ll.get(x)+" ");
        }
        System.out.print(root.data+" ");
        for(int x=0;x<lr.size();x++)
        {
            System.out.print(lr.get(x)+" ");
        }
    }
    public static void p(Node root,int x,int y)
    {
        if(root==null||x==-1)
        {
            return;
        }
        
        if(!(d.contains(y)))
        {
            if(y>0)
            {
                lr.add(root.data);
            }
            if(y<0)
            {
                ll.add(root.data);
            }
            d.add(y);
        }
        p(root.left,x-1,y-1);
        p(root.right,x-1,y+1);
        return ;
    }
