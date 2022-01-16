import token.Token;
import token.Tokenizer;
import visitor.ParserVisitor;
import visitor.TokenVisitor;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(final String[] args) throws IOException {
        final Tokenizer tokenizer = new Tokenizer(System.in);
        final List<Token> tokens = tokenizer.tokenize();

        final ParserVisitor parser = new ParserVisitor();
        tokens.forEach(token -> token.accept(parser));

        final List<Token> rpn = parser.getTokens();
    }
}
