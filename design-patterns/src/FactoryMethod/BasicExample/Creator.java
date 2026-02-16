package FactoryMethod.BasicExample;

public abstract class Creator {
    public abstract void someOperation();

    public abstract Product createProduct();

    public void render() {
        System.out.println("Creator: Rendering product...");
    }
}
