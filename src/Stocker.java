import java.util.Random;

/**
 * TODO: nothing, this should be okay
 */
public class Stocker extends Employee {
	
	int shelves = 0;
	
	/**
	 * a method which randomly determines if the Stocker has finished stocking the selves
	 * @return 
	 */
	public Boolean StockShelves() {
		Random rand = new Random();
		Boolean Finished = rand.nextBoolean();
		if(Finished == true) {
			shelves++;
			return true;
		}
		else {
			return false;
		}
	}

}
