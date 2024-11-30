package expressivo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExpressionTest {

    // Test Number class
    @Test
    public void testNumberEquality() {
        Expression num1 = new Number(5.0);
        Expression num2 = new Number(5.0);
        assertEquals("Numbers with same value should be equal", num1, num2);
    }

    @Test
    public void testNumberInequality() {
        Expression num1 = new Number(5.0);
        Expression num2 = new Number(3.0);
        assertNotEquals("Numbers with different values should not be equal", num1, num2);
    }

    @Test
    public void testNumberHashCode() {
        Expression num1 = new Number(5.0);
        Expression num2 = new Number(5.0);
        assertEquals("Numbers with same value should have same hashCode", num1.hashCode(), num2.hashCode());
    }

    // Test Variable class
    @Test
    public void testVariableEquality() {
        Expression var1 = new Variable("x");
        Expression var2 = new Variable("x");
        assertEquals("Variables with same name should be equal", var1, var2);
    }

    @Test
    public void testVariableInequality() {
        Expression var1 = new Variable("x");
        Expression var2 = new Variable("y");
        assertNotEquals("Variables with different names should not be equal", var1, var2);
    }

    @Test
    public void testVariableHashCode() {
        Expression var1 = new Variable("x");
        Expression var2 = new Variable("x");
        assertEquals("Variables with same name should have same hashCode", var1.hashCode(), var2.hashCode());
    }

    // Test Add class
    @Test
    public void testAddEquality() {
        Expression add1 = new Add(new Number(3.0), new Variable("x"));
        Expression add2 = new Add(new Number(3.0), new Variable("x"));
        assertEquals("Add expressions with same components should be equal", add1, add2);
    }

    @Test
    public void testAddInequality() {
        Expression add1 = new Add(new Number(3.0), new Variable("x"));
        Expression add2 = new Add(new Number(4.0), new Variable("x"));
        assertNotEquals("Add expressions with different components should not be equal", add1, add2);
    }

    @Test
    public void testAddHashCode() {
        Expression add1 = new Add(new Number(3.0), new Variable("x"));
        Expression add2 = new Add(new Number(3.0), new Variable("x"));
        assertEquals("Add expressions with same components should have same hashCode", add1.hashCode(), add2.hashCode());
    }

    // Test Multiply class
    @Test
    public void testMultiplyEquality() {
        Expression mul1 = new Multiply(new Number(3.0), new Variable("x"));
        Expression mul2 = new Multiply(new Number(3.0), new Variable("x"));
        assertEquals("Multiply expressions with same components should be equal", mul1, mul2);
    }

    @Test
    public void testMultiplyInequality() {
        Expression mul1 = new Multiply(new Number(3.0), new Variable("x"));
        Expression mul2 = new Multiply(new Number(3.0), new Variable("y"));
        assertNotEquals("Multiply expressions with different components should not be equal", mul1, mul2);
    }

    @Test
    public void testMultiplyHashCode() {
        Expression mul1 = new Multiply(new Number(3.0), new Variable("x"));
        Expression mul2 = new Multiply(new Number(3.0), new Variable("x"));
        assertEquals("Multiply expressions with same components should have same hashCode", mul1.hashCode(), mul2.hashCode());
    }

    // Test toString method
    @Test
    public void testNumberToString() {
        Expression num = new Number(5.0);
        assertEquals("Number toString should return its value as string", "5.0", num.toString());
    }

    @Test
    public void testVariableToString() {
        Expression var = new Variable("x");
        assertEquals("Variable toString should return its name", "x", var.toString());
    }

    @Test
    public void testAddToString() {
        Expression add = new Add(new Number(3.0), new Variable("x"));
        assertEquals("Add toString should return expression in correct format", "(3.0 + x)", add.toString());
    }

    @Test
    public void testMultiplyToString() {
        Expression mul = new Multiply(new Number(3.0), new Variable("x"));
        assertEquals("Multiply toString should return expression in correct format", "(3.0 * x)", mul.toString());
    }




  
}
