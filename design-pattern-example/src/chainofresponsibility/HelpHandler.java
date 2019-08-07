package chainofresponsibility;

public class HelpHandler {

    private HelpHandler successor;
    private String help;

    public HelpHandler(HelpHandler successor, String help) {
        this.successor = successor;
        this.help = help;
    }

    public void handleHelp() {
        if (help != null) {
            System.out.println(help);
            return;
        }
        if (successor != null) {
            successor.handleHelp();
            return;
        }
        System.out.println("도움말 없음");
    }

    public void setHelpHandler(HelpHandler helpHandler) {
        this.successor = helpHandler;
    }

}
