package FactoryMethod.BasicExample;

public class CreatorB extends Creator {
    @Override
    public void someOperation() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'someOperation'");
    }

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
