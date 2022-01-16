package token.statepattern;

import token.Token;
import visitor.TokenVisitor;

public class NumberToken implements Token {
    private final Long number;

    public NumberToken(final String str) {
        this.number = Long.parseLong(str);
    }

    @Override
    public void accept(final TokenVisitor visitor) {
        visitor.visit(this);
    }
}
