
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
import java.util.HashMap;

public class Room {

    private String description;
    private HashMap<String, Room> exits;

    public Room(String description) {
        this.description = description;
        exits = new HashMap<String, Room>();
    }

    /**
     * Define the exits of this room. Every direction either leads to another
     * room or is null (no exit there).
     */
    public void setExits(Room north, Room east, Room south, Room west, Room up, Room down) {
        if (north != null) {
            exits.put("north", north);
        }
        if (east != null) {
            exits.put("east", east);
        }
        if (south != null) {
            exits.put("south", south);
        }
        if (west != null) {
            exits.put("west", west);
        }
        if (up != null) {
            exits.put("up", up);
        }
        if (down != null) {
            exits.put("down", down);
        }
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction "If there is no room in that direction, return null.
     */
    public Room getExit(String direction) {
        return exits.get(direction);
    }

    /**
     * Return the description of the room (the one that was defined in the
     * constructor).
     */
    public String getDescription() {
        return description;
    }

}
