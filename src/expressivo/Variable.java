package expressivo;

import java.util.Objects;

/**
 * A variable in the expression.
 */
public class Variable implements Expression {
    private final String name;

    // Abstraction Function:
    //   represents a variable in the expression
    // Rep Invariant:
    //   name is a nonempty string of letters
    // Safety from rep exposure:
    //   name is immutable
    
    private void checkRep() {
        assert name.matches("[a-zA-Z]+");
    }

    public Variable(String name) {
        this.name = name;
        checkRep();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Variable)) return false;
        Variable that = (Variable) obj;
        return this.name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
