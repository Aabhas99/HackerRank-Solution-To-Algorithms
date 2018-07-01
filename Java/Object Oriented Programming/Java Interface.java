//Write your code here
class MyCalculator implements AdvancedArithmetic
{
    public int divisor_sum(int n)
    {
    int s=0;
        for(int x=1;x<=n;x++)
        {
            if(n%x==0)
            {
            s=s+x;
            }
        }
        return s;
    }
}
