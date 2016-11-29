package Creational.Builder;

/**
 * Created by benchen on 11/24/16.
 */
public abstract class Drink implements Item {
    @Override
    public abstract int price();

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
