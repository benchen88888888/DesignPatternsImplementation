package Creational.Builder;

/**
 * Created by benchen on 11/24/16.
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract int price();
}
