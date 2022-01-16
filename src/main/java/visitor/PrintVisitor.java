package visitor;

import token.statepattern.BraceToken;
import token.statepattern.NumberToken;
import token.statepattern.OperationToken;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class PrintVisitor implements TokenVisitor {
    private final PrintWriter writer;

    public PrintVisitor(final OutputStream os) {
        writer = new PrintWriter(os);
    }

    private void write(final String formatted) throws IOException {
        writer.write(String.format("%s ", formatted));
    }

    @Override
    public void visit(final NumberToken token) throws IOException {
        write(Long.toString(token.getNumber()));
    }

    @Override
    public void visit(final BraceToken token) throws IOException {
        write(Character.toString(token.getBracket()));
    }

    @Override
    public void visit(final OperationToken token) throws IOException {
        write(Character.toString(token.getOperation()));
    }

    public void print() {
        writer.flush();
    }
}
