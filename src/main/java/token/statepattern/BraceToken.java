package token.statepattern;

import token.Token;
import visitor.TokenVisitor;

public class BraceToken implements Token {
    private final char bracket;

    public BraceToken(char bracket) {
        this.bracket = bracket;
    }

    public boolean isOpen() {
        return bracket == '(';
    }

    @Override
    public void accept(final TokenVisitor visitor) {
        visitor.visit(this);
    }
}
