import java.util.ArrayList;

public class Location {

	public static ArrayList<Location> world = new ArrayList<Location>();
	public static int idCounter = 0;
	public int id;
	public String title;


	/**
	*Super Constructor for all Locations
	*/
	public Location(String title) {
		this.title = title;
		this.id = idCounter;
		idCounter++;
		world.add(this);
	}
}