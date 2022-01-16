package visitor;

import token.statepattern.BraceToken;
import token.statepattern.NumberToken;
import token.statepattern.OperationToken;

import java.io.IOException;

public interface TokenVisitor {
    void visit(final NumberToken token) throws IOException;
    void visit(final BraceToken token) throws IOException;
    void visit(final OperationToken token) throws IOException;
}
