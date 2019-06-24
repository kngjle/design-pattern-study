package bridge.window.imp;

public class PMWindowImp implements WindowImp {
    @Override
    public void devDrawText() {
        pmDrawString();
    }

    @Override
    public void devDrawLine() {
        pmDrawLine();
    }

    private void pmDrawString() {
        System.out.println("PM Draw String");
    }

    private void pmDrawLine() {
        System.out.println("PM Draw Line");
    }

}
