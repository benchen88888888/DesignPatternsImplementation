package Behavioral.Visitor;

/**
 * Created by benchen on 11/26/16.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
