package ru.vichukano.my.java.notes.patterns.visitor;

interface OperationVisitor {

    void visit(CashInOperation cashIn);

    void visit(CheckBalanceOperation checkBalance);

    void visit(WithdrawalOperation withdrawal);

}
