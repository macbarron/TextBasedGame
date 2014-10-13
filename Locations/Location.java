import java.util.ArrayList;

public class Location {

	public static ArrayList<Location> world = new ArrayList<Location>();
	public static int idCounter = 0;
	public int id;
	protected String title;

	/**
	*Super Constructor for all Locations
	*/
	public Location(String title) {
		this.title = title;
		this.id = idCounter;
		idCounter++;
		world.add(this);
	}

	/**
	*Custom equals method, compares Locations using the id instance variable
	*/
	public boolean equals(Object other) {
		Location a = ((Location)other);
		if (this.id == a.id) {
			return true;
		} else {
			return false;
		}
	}

	/**
	*Gives string to dislay when entering room or looking around
	*/
	public String roomInfo() {
		return "You are in a " + title;
	}
}