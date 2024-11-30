package expressivo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExpressionTest {

    @Test
    public void testNumber() {
        Expression num = new Number(5);
        assertEquals("5.0", num.toString());
        assertEquals(num, new Number(5));
        assertNotEquals(num, new Number(6));
    }

    @Test
    public void testVariable() {
        Expression var = new Variable("x");
        assertEquals("x", var.toString());
        assertEquals(var, new Variable("x"));
        assertNotEquals(var, new Variable("y"));
    }

    @Test
    public void testAdd() {
        Expression add = new Add(new Number(3), new Variable("x"));
        assertEquals("(3.0 + x)", add.toString());
        assertEquals(add, new Add(new Number(3), new Variable("x")));
        assertNotEquals(add, new Add(new Number(4), new Variable("x")));
    }

    @Test
    public void testMultiply() {
        Expression mul = new Multiply(new Number(3), new Variable("x"));
        assertEquals("(3.0 * x)", mul.toString());
        assertEquals(mul, new Multiply(new Number(3), new Variable("x")));
        assertNotEquals(mul, new Multiply(new Number(4), new Variable("x")));
    }
}
