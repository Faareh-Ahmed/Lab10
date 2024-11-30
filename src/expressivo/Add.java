package expressivo;

import java.util.Objects;

/**
 * An addition operation in the expression.
 */
public class Add implements Expression {
    private final Expression left, right;

    // Abstraction Function:
    //   represents the sum of left and right expressions
    // Rep Invariant:
    //   left and right are non-null
    // Safety from rep exposure:
    //   left and right are immutable
    
    private void checkRep() {
        assert left != null && right != null;
    }

    public Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
        checkRep();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Add)) return false;
        Add that = (Add) obj;
        return this.left.equals(that.left) && this.right.equals(that.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }
}
