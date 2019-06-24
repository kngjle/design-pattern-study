package bridge.window.imp;

public abstract class WindowSystemFactory {

    private static WindowSystemFactory windowSystemFactory;

    public static WindowSystemFactory getInstance() {
        if (windowSystemFactory != null) {
            return windowSystemFactory;
        }

        String platform = System.getProperty("platform");

        switch (platform) {
            case "XWindow":
                windowSystemFactory = new XWindowSystemFactory();
                break;
            case "PMWindow":
                windowSystemFactory =  new PMWindowSystemFactory();
                break;
        }

        return windowSystemFactory;
    }

    public abstract WindowImp makeWindowImp();

}
