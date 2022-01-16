package token.statepattern;

import token.Token;
import visitor.TokenVisitor;

public class OperationToken implements Token {
    private final char operation;

    public OperationToken(final char operation) {
        this.operation = operation;
    }

    @Override
    public void accept(final TokenVisitor visitor) {
        visitor.visit(this);
    }
}
