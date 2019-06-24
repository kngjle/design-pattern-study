package bridge.window.imp;

public class XWindowImp implements WindowImp {
    @Override
    public void devDrawText() {
        xDrawString();
    }

    @Override
    public void devDrawLine() {
        xDrawLine();
    }

    private void xDrawString() {
        System.out.println("X Draw String");
    }

    private void xDrawLine() {
        System.out.println("X Draw Line");
    }
}
