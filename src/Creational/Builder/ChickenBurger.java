package Creational.Builder;

/**
 * Created by benchen on 11/24/16.
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public int price() {
        return 50;
    }

    @Override
    public Packing packing() {
        return super.packing();
    }
}
