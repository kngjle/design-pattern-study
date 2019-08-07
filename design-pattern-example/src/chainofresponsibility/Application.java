package chainofresponsibility;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        Dialog dialog = new Dialog();
        Button button = new Button(dialog);
    }
}
