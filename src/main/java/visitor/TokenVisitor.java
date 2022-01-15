package visitor;

import token.state.BraceToken;
import token.state.NumberToken;
import token.state.OperationToken;

public interface TokenVisitor {
    void visit(final NumberToken token);
    void visit(final BraceToken token);
    void visit(final OperationToken token);
}
