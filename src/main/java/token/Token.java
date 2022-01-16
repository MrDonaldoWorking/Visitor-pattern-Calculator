package token;

import visitor.TokenVisitor;

import java.io.IOException;

public interface Token {
    void accept(final TokenVisitor visitor) throws IOException;
}
