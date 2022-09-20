package ru.vichukano.my.java.notes.patterns.visitor.visitor;

import ru.vichukano.my.java.notes.patterns.visitor.operation.CashInOperation;
import ru.vichukano.my.java.notes.patterns.visitor.operation.CheckBalanceOperation;
import ru.vichukano.my.java.notes.patterns.visitor.operation.WithdrawalOperation;

public interface OperationVisitor {

    void visit(CashInOperation cashIn);

    void visit(CheckBalanceOperation checkBalance);

    void visit(WithdrawalOperation withdrawal);

}
