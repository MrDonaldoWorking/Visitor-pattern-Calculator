package token.state;

import token.Token;
import visitor.TokenVisitor;

public class BraceToken implements Token {
    @Override
    public void accept(final TokenVisitor visitor) {
        visitor.visit(this);
    }
}
