package FactoryMethod.UIExample;

import java.util.function.Consumer;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("WindowsButton.render");
    }

    @Override
    public void onClick(Consumer<?> callback) {
        System.out.println("WindowsButton.onClick");
        callback.accept(null);
    }

}
