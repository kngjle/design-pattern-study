package bridge;

import bridge.window.IconWindow;
import bridge.window.TransientWindow;

public class App {

    public static void main(String[] args) {
        if (System.getProperty("platform") == null) {
            System.setProperty("platform", "XWindow");
        }

        IconWindow iconWindow = new IconWindow();
        iconWindow.drawBorder();

        TransientWindow transientWindow = new TransientWindow();
        transientWindow.drawCloseBox();
    }
}
