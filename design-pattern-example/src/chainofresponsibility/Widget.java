package chainofresponsibility;

public abstract class Widget extends HelpHandler {

    private Widget parent;

    public Widget(Widget parent) {
        super(parent, null);
        this.parent = parent;
    }

    public Widget(Widget parent, String help) {
        super(parent, help);
        this.parent = parent;
    }

}
