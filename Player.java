import java.util.ArrayList;

public class Player {

	private static int currentLocation;
	private static int health = 100;
	private static ArrayList<Item> inventory = new ArrayList<Item>();
	
	public static void main(String[] args) {
		while (true) {
	    try {
	        Thread.sleep(300 * 1000); //argument in milliseconds
	        //currently 300 seconds = 5 minutes
	    }
	    catch (InterruptedException ie) {
	        ie.printStackTrace();
	    }
	    changeHealth(-5); //Lose 5 health every 5 minutes
		}
	}	

	public static int getHealth(){
		return health;
	}

	public static String getLocation() {
		return this.currentLocation.getTitle();
	}

	public static void changeHealth(int change){
		health += change;
	}
}