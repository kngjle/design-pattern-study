package chainofresponsibility;

public abstract class Widget {

    private Widget parent;

    public Widget(Widget parent) {
        this.parent = parent;
    }

}
