class Student extends Person{
	private int[] testScores;
    Student(String firstName, String lastName, int identification,int testScores[])
    {
        super(firstName,lastName,identification);
        this.testScores=testScores;
    }
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public char calculate()
    {
        int s=0;
        for(int x=0;x<testScores.length;x++)
        {
            s=s+testScores[x];
        }
        s=s/testScores.length;
        if(s>=90&&s<=100)
        {
            return 'O';
        }
        else if(s>=80&&s<90)
        {
            return 'E';
        }
        else if(s>=70&&s<80)
        {
            return 'A';
        }
        else if(s>=55&&s<70)
        {
            return 'P';
        }
        else if(s>=40&&s<55)
        {
            return 'D';
        }
        else
        {
            return 'T';
        }
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}
