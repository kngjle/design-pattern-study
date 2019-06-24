package bridge.window;

import bridge.window.imp.WindowImp;
import bridge.window.imp.WindowSystemFactory;

public abstract class Window {

    private WindowImp imp;

    public Window() {
        WindowSystemFactory windowSystemFactory = WindowSystemFactory.getInstance();
        imp = windowSystemFactory.makeWindowImp();
    }

    public void drawText() {
        imp.devDrawText();
    }

    public void drawRect() {
        imp.devDrawLine();
        imp.devDrawLine();
        imp.devDrawLine();
        imp.devDrawLine();
    }

}
