package token.statepattern;

import token.Token;
import visitor.TokenVisitor;

import java.util.Map;

public class OperationToken implements Token {
    private static final Map<Character, Integer> rank = Map.of('+', 1, '-', 1, '*', 2, '/', 2);
    private final char operation;

    public OperationToken(final char operation) {
        this.operation = operation;
    }

    public int getRank() {
        return rank.get(operation);
    }

    @Override
    public void accept(final TokenVisitor visitor) {
        visitor.visit(this);
    }
}
