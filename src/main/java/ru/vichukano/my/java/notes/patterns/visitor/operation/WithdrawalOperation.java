package ru.vichukano.my.java.notes.patterns.visitor.operation;


import ru.vichukano.my.java.notes.patterns.visitor.visitor.OperationVisitor;

public class WithdrawalOperation implements VisibleOperation {

    @Override
    public void accept(OperationVisitor visitor) {
        visitor.visit(this);
    }

}
