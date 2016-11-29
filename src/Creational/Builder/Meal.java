package Creational.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by benchen on 11/24/16.
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();
    public void addItem(Item item){
        items.add(item);
    }
    public int getCost(){
        int cost = 0;
        for(Item item:items){
            cost += item.price();
        }
        return cost;
    }
    public void printItems(){
        for(Item item:items){
            System.out.println("Item name: "+item.name()+"Item price: "+item.price()+" Item package: "+item.packing());
        }
    }
}
