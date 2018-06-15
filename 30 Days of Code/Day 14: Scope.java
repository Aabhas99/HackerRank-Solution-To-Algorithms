	// Add your code here
public Difference(int ar[])
{
    elements=ar;
}
public void computeDifference()
{
    int m=-99999;
    for(int x=0;x<elements.length;x++)
    {
        for(int y=x+1;y<elements.length;y++)
        {
            if(Math.abs(elements[x]-elements[y])>m)
            {
                m=Math.abs(elements[x]-elements[y]);
            }
        }
    }
    maximumDifference=m;
}
