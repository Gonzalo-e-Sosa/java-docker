// Make an object aware of the original one, so when you makes changes in the original you change the reference too
public interface Referenceable {
    public boolean referenceTo(Referenceable other); // A -> B

    // TODO: receive a class Action as a parameter
    public void applyAction(); // fn(A) -> fn(B)
}
