package Behavioral.Visitor;

/**
 * Created by benchen on 11/26/16.
 */
public class Keyboard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
