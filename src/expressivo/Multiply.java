package expressivo;

import java.util.Objects;

/**
 * A multiplication operation in the expression.
 */
public class Multiply implements Expression {
    private final Expression left, right;

    // Abstraction Function:
    //   represents the product of left and right expressions
    // Rep Invariant:
    //   left and right are non-null
    // Safety from rep exposure:
    //   left and right are immutable
    
    private void checkRep() {
        assert left != null && right != null;
    }

    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
        checkRep();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Multiply)) return false;
        Multiply that = (Multiply) obj;
        return this.left.equals(that.left) && this.right.equals(that.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }
}
