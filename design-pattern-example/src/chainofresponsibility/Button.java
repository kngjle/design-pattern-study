package chainofresponsibility;

public class Button extends Widget {

    public Button(Widget widget) {
        super(widget);
    }

    public Button(Widget widget, String help) {
        super(widget, help);
    }

}
