public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}

// Interfaces
interface Button { void click(); }
interface Checkbox { void check(); }
interface TextField { void type(String text); }

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
    TextField createTextField();
}


class WindowsButton implements Button {
    public void click() {
        System.out.println("Clicked Windows Button");
    }
}

class WindowsCheckbox implements Checkbox {
    public void check() {
        System.out.println("Checked Windows Checkbox");
    }
}

class WindowsTextField implements TextField {
    public void type(String text) {
        System.out.println("Typed in Windows TextField: " + text);
    }
}

class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
    public TextField createTextField() {
        return new WindowsTextField();
    }
}


class MacButton implements Button {
    public void click() {
        System.out.println("Clicked Mac Button");
    }
}

class MacCheckbox implements Checkbox {
    public void check() {
        System.out.println("Checked Mac Checkbox");
    }
}

class MacTextField implements TextField {
    public void type(String text) {
        System.out.println("Typed in Mac TextField: " + text);
    }
}

class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
    public TextField createTextField() {
        return new MacTextField();
    }
}

// Client
class Application {
    private Button button;
    private Checkbox checkbox;
    private TextField textField;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        textField = factory.createTextField();
    }

    public void renderUI() {
        button.click();
        checkbox.check();
        textField.type("Hello, world!");
    }
}
