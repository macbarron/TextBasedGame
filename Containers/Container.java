import java.util.ArrayList;

public class Container {

    public String name;
    public boolean hasItems = true; //Initially has at least 1 item
    public ArrayList<Item> itemsList = new ArrayList<Item>();

    /**
    *Super constructor for all Containers
    */
    public Container(String name, ArrayList itemsList) {
        this.name = name;
        this.itemsList = itemsList;
    }

    /**
    *Gives string to display when checking container
    */
    public String containerInfo() {
        if (this.itemsList.isEmpty()) {
            return "There's nothing there.";
        } else {
            return "This " + name + " has:\n" + this.getList();
        }
    }

    /**
    *Gives list of all items contained in container
    */
    public String getList() {
        public String theList;
        for (int i = 0; i < itemList.size(); i++) {
            theList = theList + itemsList(i).getName();
        }
        return theList;
    }

}