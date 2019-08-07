package chainofresponsibility;

public class Application extends HelpHandler {


    public Application(String help) {
        super(null, help);
    }

    public static void main(String[] args) {
        Application application = new Application("프로그램 도움말");
        Dialog dialog = new Dialog(application);
        Button button = new Button(dialog);

        button.handleHelp();
        dialog.handleHelp();
    }
}
