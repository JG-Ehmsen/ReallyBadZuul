/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeppe
 */
public class Item {
    
    private int weight;
    private String name;
    
    public Item(String name, int weight)
    {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString()
    {
        return name + ", " + "Weight " + weight + ".";
    }
    
}
