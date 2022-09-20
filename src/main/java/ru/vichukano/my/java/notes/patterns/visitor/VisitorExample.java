package ru.vichukano.my.java.notes.patterns.visitor;

import ru.vichukano.my.java.notes.patterns.visitor.operation.CashInOperation;
import ru.vichukano.my.java.notes.patterns.visitor.operation.CheckBalanceOperation;
import ru.vichukano.my.java.notes.patterns.visitor.operation.WithdrawalOperation;
import ru.vichukano.my.java.notes.patterns.visitor.visitor.OperationVisitor;

class VisitorExample {

    void show() {
        var visitor = new OperationVisitor() {
            @Override
            public void visit(CashInOperation cashIn) {
                System.out.println("visit cash in");
            }

            @Override
            public void visit(CheckBalanceOperation checkBalance) {
                System.out.println("visit check balance");
            }

            @Override
            public void visit(WithdrawalOperation withdrawal) {
                System.out.println("visit withdrawal");
            }
        };
        visitor.visit(new CashInOperation());
        visitor.visit(new CheckBalanceOperation());
        visitor.visit(new WithdrawalOperation());
    }

}
