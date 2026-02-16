package FactoryMethod.UIExample;

public abstract class Dialog {
    Boolean open;

    public abstract Button createButton();

    public void closeDialog() {
        this.open = false;
    }

    public void render() {
        Button okButton = createButton();
        okButton.onClick(_evt -> this.closeDialog());
        okButton.render();

        System.out.println("Render Windows Dialog");
    }
}
