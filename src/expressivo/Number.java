package expressivo;

import java.util.Objects;

/**
 * A number in the expression.
 */
public class Number implements Expression {
    private final double value;

    // Abstraction Function:
    //   represents a numerical constant in the expression
    // Rep Invariant:
    //   true (no restrictions for double values)
    // Safety from rep exposure:
    //   value is immutable
    
    private void checkRep() {
        // no constraints to check
    }

    public Number(double value) {
        this.value = value;
        checkRep();
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Number)) return false;
        Number that = (Number) obj;
        return Double.compare(this.value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
