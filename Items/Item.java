public class Item {

    public String name;

    /**
    *Super constructor for all Items
    */
	public Item(String name) {
        this.name = name;
    }

    /**
    *Gives name of Item, for use in other classes
    */
    public getName() {
        return name;
    }
}