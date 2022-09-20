package ru.vichukano.my.java.notes.patterns.visitor.operation;


import ru.vichukano.my.java.notes.patterns.visitor.visitor.OperationVisitor;

public interface VisibleOperation {

    void accept(OperationVisitor visitor);

}
