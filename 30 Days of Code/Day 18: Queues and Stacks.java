public class Solution {
    // Write your code here.
    int i=-1,f=-1,r=-1;
    char ar1[]=new char[50];
    char ar2[]=new char[50];
    void pushCharacter(char ch)
    {
        ar1[++i]=ch;
    }
    void enqueueCharacter(char ch)
    {
        if(r==-1)
        {
            f++;
        }
        ar2[++r]=ch;
    }
    char popCharacter()
    {
        return ar1[i--];
    }
    char dequeueCharacter()
    {
        return ar2[f++];
    }
