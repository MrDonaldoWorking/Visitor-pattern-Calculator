package token.state;

import token.Token;
import visitor.TokenVisitor;

public class NumberToken implements Token {
    @Override
    public void accept(final TokenVisitor visitor) {
        visitor.visit(this);
    }
}
