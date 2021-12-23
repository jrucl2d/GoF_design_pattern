package com.example.gof.structure;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * facade 클래스 : 인터페이스를 간소화
 */
public class Compiler {
    public void compile(InputStream inputStream, OutputStream outputStream) {
        Scanner scanner = new Scanner(inputStream);
        ProgramNodeBuilder builder = new ProgramNodeBuilder();
        Parser parser = new Parser();
        parser.parse(scanner, builder);

        CodeGenerator generator = new CodeGenerator(outputStream);
        ProgramNode parseTree = builder.getRootNode();
        parseTree.traverse(generator);
    }
}
