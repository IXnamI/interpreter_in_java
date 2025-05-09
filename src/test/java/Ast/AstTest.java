package Ast;

import com.github.xnam.ast.Identifier;
import com.github.xnam.ast.LetStatement;
import com.github.xnam.ast.Program;
import com.github.xnam.token.Token;
import com.github.xnam.token.TokenType;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AstTest {
    @Test
    public void TestString() {
        LetStatement stmt = new LetStatement(Token.newToken(TokenType.LET, "let"));
        stmt.setName(new Identifier(Token.newToken(TokenType.IDENT, "myVar"), "myVar"));
        stmt.setValue(new Identifier(Token.newToken(TokenType.IDENT, "anotherVar"), "anotherVar"));
        Program prog = new Program();
        prog.statements.add(stmt);
        assertEquals(prog.toString(), "let myVar = anotherVar;", "program.toString() is wrong, got = " + prog.toString());
    }
}
