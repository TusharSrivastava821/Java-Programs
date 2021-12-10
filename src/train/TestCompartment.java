// Create an abstract class Compartment to represent a rail coach. 
// Provide an abstract function notice in this class :- public abstract String notice();
// Derive FirstClass, Ladies, General, Luggage classes from the compartment class. 
// Override the notice function in each of them to print notice message that is suitable to the specific type of  compartment.
// Create a class TestCompartment.Write main function to do the following:
// Declare an array of Compartment of size 10.
// Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
// Check the polymorphic behavior of the notice method. [i.e based on the random  number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]

package train;
import java.util.Random;
public class TestCompartment 
{
	public static void main(String[] args) 
    {
		Compartment[] compartments = new Compartment[10];
		Random n = new Random();
	    for (int i = 0; i < 10; i++) {
	    	int randomNum = n.nextInt((4 - 1) + 1) + 1;
	    	if (randomNum == 1)
	    		compartments[i] = new FirstClass();
	    	else if (randomNum == 2)
	    		compartments[i] = new Ladies();
	    	else if (randomNum == 3)
	    		compartments[i] = new General();
	    	else if (randomNum == 4)
	    		compartments[i] = new Luggage();
	    	compartments[i].notice();
	    }
	}
}
