package game;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dev on 8/12/2015.
 */
public class Location {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>(); //inizializuojam 'Map' konstruktoriuje ir gausim rezultata kaip 'HashMap';
    }
    //metodas su dviem parametrais kuris grazina rezultata kaip masyva 'hashmap';
    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }
    // geteriai
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
