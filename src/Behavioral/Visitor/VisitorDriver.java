package Behavioral.Visitor;

/**
 * Created by benchen on 11/26/16.
 */
public class VisitorDriver {
    public static void main(String args[]){
        System.out.println("Visitor Pattern");
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
