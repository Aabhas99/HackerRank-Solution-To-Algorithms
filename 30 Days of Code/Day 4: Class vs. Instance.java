public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		if(initialAge>=0)
        {
            age=initialAge;
        }
        else
        {
            System.out.println("Age is not valid, setting age to 0.");
            age=0;
        }// Add some more code to run some checks on initialAge
	}

	public void amIOld() {
  		if(age<13)
        {// Write code determining if this person's age is old and print the correct statement:
            System.out.println("You are young.");
        }
        else if(age>=13&&age<18)
        {
            System.out.println("You are a teenager.");
        }
        else
        {
            System.out.println("You are old.");
        }
	}

	public void yearPasses() {
  		age++;// Increment this person's age.
	}
