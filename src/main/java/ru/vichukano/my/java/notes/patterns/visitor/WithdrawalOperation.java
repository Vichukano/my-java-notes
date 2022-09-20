package ru.vichukano.my.java.notes.patterns.visitor;

class WithdrawalOperation implements VisibleOperation {

    @Override
    public void accept(OperationVisitor visitor) {
        visitor.visit(this);
    }

}
