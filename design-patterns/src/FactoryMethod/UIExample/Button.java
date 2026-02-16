package FactoryMethod.UIExample;

import java.util.function.Consumer;

public interface Button {
    public void render();

    public void onClick(Consumer<?> callback);
}
