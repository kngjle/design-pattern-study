package chainofresponsibility;

public class Dialog extends Widget {

    public Dialog() {
        super(null);
    }

    public Dialog(HelpHandler helpHandler, String help) {
        super(null, help);
        setHelpHandler(helpHandler);
    }

    public Dialog(HelpHandler helpHandler) {
        super(null);
        setHelpHandler(helpHandler);
    }
}
