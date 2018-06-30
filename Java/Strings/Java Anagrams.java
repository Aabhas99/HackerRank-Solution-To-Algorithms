    static boolean isAnagram(String a, String b) {
        char ch1[]=(a.toLowerCase()).toCharArray();
        char ch2[]=(b.toLowerCase()).toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int f=0;
        if(a.length()!=b.length())
        {
            return false;
        }
        for(int x=0;x<a.length();x++)
        {
            if(ch1[x]!=ch2[x])
            {
                f++;
                break;
            }
        }
        if(f==0)
        {
            return true;
        }
        return false;
        // Complete the function
    }
