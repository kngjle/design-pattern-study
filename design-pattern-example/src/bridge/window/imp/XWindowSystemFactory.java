package bridge.window.imp;

public class XWindowSystemFactory extends WindowSystemFactory {

    public WindowImp makeWindowImp() {
        return new XWindowImp();
    }
}
