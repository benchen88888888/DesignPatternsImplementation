package Creational.Builder;

/**
 * Created by benchen on 11/24/16.
 */
public class Coke extends Drink{
    @Override
    public Packing packing() {
        return super.packing();
    }

    @Override
    public int price() {
        return 10;
    }

    @Override
    public String name() {
        return "Coke Drink";
    }
}
