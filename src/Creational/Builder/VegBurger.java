package Creational.Builder;

/**
 * Created by benchen on 11/24/16.
 */
public class VegBurger extends Burger {
    @Override
    public Packing packing() {
        return super.packing();
    }

    @Override
    public int price() {
        return 20;
    }

    @Override
    public String name() {
        return "VegBurger";
    }
}
