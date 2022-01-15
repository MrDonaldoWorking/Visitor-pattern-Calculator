package token.state;

import token.Token;
import visitor.TokenVisitor;

public class OperationToken implements Token {
    @Override
    public void accept(final TokenVisitor visitor) {
        visitor.visit(this);
    }
}
