public class Player {

	private static int currentLocation;
	private static int health = 100;
	
	public static void main(String[] args) {
		while (true) {
	    try {
	        Thread.sleep(300 * 1000); // the argument here represents milliseconds, currently configured to 5 minutes
	    }
	    catch (InterruptedException ie) {
	        ie.printStackTrace();
	    }
	    changeHealth();

		}
	}	

	public static void changeHealth(){
		health = health - 5;
		System.out.println(health);
	}

	public static int getHealth(){
		return health;
	}

	public static void changeHealth(int change){
		health += change;
	}
}