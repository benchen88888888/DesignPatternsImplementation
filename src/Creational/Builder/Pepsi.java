package Creational.Builder;

/**
 * Created by benchen on 11/24/16.
 */
public class Pepsi extends Drink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public int price() {
        return 15;
    }

    @Override
    public Packing packing() {
        return super.packing();
    }
}
