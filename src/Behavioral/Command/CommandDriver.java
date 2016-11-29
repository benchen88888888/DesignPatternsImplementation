package Behavioral.Command;

/**
 * Created by benchen on 11/26/16.
 */
public class CommandDriver {
    public static void main(String args[]){
        System.out.println("Command Pattern");
        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();
    }
}
