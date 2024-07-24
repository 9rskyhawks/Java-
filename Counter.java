public class Counter
{

  // Static data member

  private static int count = 0;



  // Parameterized constructor

  public Counter ()
  {

	// Increment the count when an object is created

	incrementCounter ();
  
  }



  // Static method to increment the count

  public static void incrementCounter ()
  {

	count++;

  }



  // Main method to create objects and display the final count

  public static void main (String[]args)
  {

	Counter counter1 = new Counter ();

	Counter counter2 = new Counter ();

	Counter counter3 = new Counter ();



	// Display the final count

	System.out.println ("The final count is: " + count);

  }

}
