package FactoryMethod.UIExample;

import java.util.function.Consumer;

public class HTMLButton implements Button {

    @Override
    public void render() {
        System.out.println("HTMLButton.render");
    }

    @Override
    public void onClick(Consumer<?> callback) {
        System.out.println("HTMLButton.onClick");
        callback.accept(null);
    }

}
