// Create an abstract class Instrument which is having the abstract function play. 
// Create three more sub classes from Instrument which is Piano, Flute, Guitar. 
// Override the play method inside all three classes printing a message 
// “Piano is playing  tan tantantan  ”  for Piano class
// “Flute is playing  toot toottoottoot”  for Flute class
// “Guitar is playing  tin  tintin ”  for Guitar class 
// You must not allow the user to declare an object of Instrument class.
// Create an array of 10 Instruments.
// Assign different type of instrument to Instrument reference.
// Check for the polymorphic behavior of  play method.
// Use the instanceof operator to print that which object stored at which index of instrument array.

package instruments;
import java.util.Random;

public class InstrumentMain 
{
	public static void main(String[] args) 
    {
		Instrument[] instruments = new Instrument[10];	
		Random n = new Random();
	    for (int i = 0; i < 10; i++) 
        {
	    	int randomNum = n.nextInt((3 - 1) + 1) + 1;
	    	if (randomNum == 1)
	    		instruments[i] = new Piano();
	    	else if (randomNum == 2)
	    		instruments[i] = new Flute();
	    	else if (randomNum == 3)
	    		instruments[i] = new Guitar();
	    	instruments[i].play();
	    }
	    for (int i = 0; i < 10; i++) 
        {
	    	if (instruments[i] instanceof Piano) 
	    		System.out.println("Piano is stored at index " + i);
	    	else if (instruments[i] instanceof Flute) 
	    		System.out.println("Flute is stored at index " + i);
	    	else if (instruments[i] instanceof Guitar) 
	    		System.out.println("Guitar is stored at index " + i);
	    }
	}
}

