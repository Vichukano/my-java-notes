package ru.vichukano.my.java.notes.patterns.visitor;

interface VisibleOperation {

    void accept(OperationVisitor visitor);

}
