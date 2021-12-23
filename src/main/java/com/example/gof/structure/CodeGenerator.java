package com.example.gof.structure;

import java.io.OutputStream;

public class CodeGenerator {
    protected OutputStream outputStream;

    public CodeGenerator(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void visit(ProgramNode.StatementNode node) {}
    public void visit(ProgramNode.ExpressionNode node) {}
}
