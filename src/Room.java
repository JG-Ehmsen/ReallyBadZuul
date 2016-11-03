
/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application.
 * "World of Zuul" is a very simple, text based adventure game.
 *
 * A "Room" represents one location in the scenery of the game.  It is
 * connected to other rooms via exits.  The exits are labelled north,
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 *
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Room {

    private String description;
    private HashMap<String, Room> exits;
    private List<Item> itemList = new ArrayList<>();

    public Room(String description) {
        this.description = description;
        exits = new HashMap<String, Room>();
    }

    /**
     * Define the exits of this room. Every direction either leads to another
     * room or is null (no exit there).
     */
    public void setExits(String direction, Room neighbour) {
        exits.put(direction, neighbour);
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction "If there is no room in that direction, return null.
     */
    public Room getExit(String direction) {
        return exits.get(direction);
    }

    public String getExitString() {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for (String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    public String getLongDescription() {
        String allItems = "";
        if (itemList.isEmpty()) {
            return "You are " + description + ".\n" + getExitString() + "\nThere are no items here.";
        } else {
            for (Item item : itemList) {
                allItems = allItems + item;
            }
        }
        return "You are " + description + ".\n" + getExitString() + "\nThe following items are here: " + allItems;
    }

    /**
     * Return the description of the room (the one that was defined in the
     * constructor).
     */
    public String getDescription() {
        return description;
    }

    public void addItem(String name, int weight) {
        Item e = new Item(name, weight);
        itemList.add(e);
    }
}
