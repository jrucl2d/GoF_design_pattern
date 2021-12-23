package com.example.gof.structure;

import java.util.List;

public class ProgramNode {
    public void getSourcePosition(int line, int index) {}

    public void add(ProgramNode programNode) {}
    public void remove(ProgramNode programNode) {}

    public void traverse(CodeGenerator codeGenerator) {}

    public static class StatementNode extends ProgramNode {}
    public static class ExpressionNode extends ProgramNode {
        @Override
        public void traverse(CodeGenerator codeGenerator) {
            codeGenerator.visit(this);
        }
    }
}
