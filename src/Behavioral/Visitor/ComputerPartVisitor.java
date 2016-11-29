package Behavioral.Visitor;

/**
 * Created by benchen on 11/26/16.
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
