package bridge.window.imp;

public class PMWindowSystemFactory extends WindowSystemFactory {

    @Override
    public WindowImp makeWindowImp() {
        return new PMWindowImp();
    }
}
