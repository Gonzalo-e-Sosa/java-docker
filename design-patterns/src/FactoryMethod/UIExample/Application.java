package FactoryMethod.UIExample;

public class Application {
    Dialog dialog;

    public void initialize() throws Exception {
        Config config = readApplicationConfigFile();

        if (config.OS == OS.Windows) {
            dialog = new WindowsDialog();
        } else if (config.OS == OS.Web) {
            dialog = new WebDialog();
        } else {
            throw new Exception("Error! Unknown operating system.");
        }

        dialog.render();
    }

    public Config readApplicationConfigFile() {
        return new Config(OS.Windows);
    }
}

enum OS {
    Windows, Web
}

class Config {
    OS OS;

    Config(OS OS) {
        this.OS = OS;
    }
}